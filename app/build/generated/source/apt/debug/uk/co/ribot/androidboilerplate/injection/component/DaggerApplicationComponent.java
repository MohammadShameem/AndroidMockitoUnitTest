package uk.co.ribot.androidboilerplate.injection.component;

import android.app.Application;
import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.ribot.androidboilerplate.data.DataManager;
import uk.co.ribot.androidboilerplate.data.DataManager_Factory;
import uk.co.ribot.androidboilerplate.data.SyncService;
import uk.co.ribot.androidboilerplate.data.SyncService_MembersInjector;
import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper;
import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper_Factory;
import uk.co.ribot.androidboilerplate.data.local.DbOpenHelper;
import uk.co.ribot.androidboilerplate.data.local.DbOpenHelper_Factory;
import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper;
import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper_Factory;
import uk.co.ribot.androidboilerplate.data.remote.RibotsService;
import uk.co.ribot.androidboilerplate.injection.module.ApplicationModule;
import uk.co.ribot.androidboilerplate.injection.module.ApplicationModule_ProvideApplicationFactory;
import uk.co.ribot.androidboilerplate.injection.module.ApplicationModule_ProvideContextFactory;
import uk.co.ribot.androidboilerplate.injection.module.ApplicationModule_ProvideRibotsServiceFactory;
import uk.co.ribot.androidboilerplate.util.RxEventBus;
import uk.co.ribot.androidboilerplate.util.RxEventBus_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<RibotsService> provideRibotsServiceProvider;

  private Provider<Context> provideContextProvider;

  private Provider<PreferencesHelper> preferencesHelperProvider;

  private Provider<DbOpenHelper> dbOpenHelperProvider;

  private Provider<DatabaseHelper> databaseHelperProvider;

  private Provider<DataManager> dataManagerProvider;

  private MembersInjector<SyncService> syncServiceMembersInjector;

  private Provider<Application> provideApplicationProvider;

  private Provider<RxEventBus> rxEventBusProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideRibotsServiceProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideRibotsServiceFactory.create(builder.applicationModule));

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.preferencesHelperProvider =
        DoubleCheck.provider(PreferencesHelper_Factory.create(provideContextProvider));

    this.dbOpenHelperProvider =
        DoubleCheck.provider(
            DbOpenHelper_Factory.create(
                MembersInjectors.<DbOpenHelper>noOp(), provideContextProvider));

    this.databaseHelperProvider =
        DoubleCheck.provider(DatabaseHelper_Factory.create(dbOpenHelperProvider));

    this.dataManagerProvider =
        DoubleCheck.provider(
            DataManager_Factory.create(
                provideRibotsServiceProvider, preferencesHelperProvider, databaseHelperProvider));

    this.syncServiceMembersInjector = SyncService_MembersInjector.create(dataManagerProvider);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);

    this.rxEventBusProvider = DoubleCheck.provider(RxEventBus_Factory.create());
  }

  @Override
  public void inject(SyncService syncService) {
    syncServiceMembersInjector.injectMembers(syncService);
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public RibotsService ribotsService() {
    return provideRibotsServiceProvider.get();
  }

  @Override
  public PreferencesHelper preferencesHelper() {
    return preferencesHelperProvider.get();
  }

  @Override
  public DatabaseHelper databaseHelper() {
    return databaseHelperProvider.get();
  }

  @Override
  public DataManager dataManager() {
    return dataManagerProvider.get();
  }

  @Override
  public RxEventBus eventBus() {
    return rxEventBusProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
