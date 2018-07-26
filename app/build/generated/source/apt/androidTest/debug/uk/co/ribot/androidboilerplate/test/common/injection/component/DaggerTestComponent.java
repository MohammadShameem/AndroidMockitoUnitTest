package uk.co.ribot.androidboilerplate.test.common.injection.component;

import android.app.Application;
import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.ribot.androidboilerplate.data.DataManager;
import uk.co.ribot.androidboilerplate.data.SyncService;
import uk.co.ribot.androidboilerplate.data.SyncService_MembersInjector;
import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper;
import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper_Factory;
import uk.co.ribot.androidboilerplate.data.local.DbOpenHelper;
import uk.co.ribot.androidboilerplate.data.local.DbOpenHelper_Factory;
import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper;
import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper_Factory;
import uk.co.ribot.androidboilerplate.data.remote.RibotsService;
import uk.co.ribot.androidboilerplate.test.common.injection.module.ApplicationTestModule;
import uk.co.ribot.androidboilerplate.test.common.injection.module.ApplicationTestModule_ProvideApplicationFactory;
import uk.co.ribot.androidboilerplate.test.common.injection.module.ApplicationTestModule_ProvideContextFactory;
import uk.co.ribot.androidboilerplate.test.common.injection.module.ApplicationTestModule_ProvideDataManagerFactory;
import uk.co.ribot.androidboilerplate.test.common.injection.module.ApplicationTestModule_ProvideRibotsServiceFactory;
import uk.co.ribot.androidboilerplate.util.RxEventBus;
import uk.co.ribot.androidboilerplate.util.RxEventBus_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerTestComponent implements TestComponent {
  private Provider<DataManager> provideDataManagerProvider;

  private MembersInjector<SyncService> syncServiceMembersInjector;

  private Provider<Context> provideContextProvider;

  private Provider<Application> provideApplicationProvider;

  private Provider<RibotsService> provideRibotsServiceProvider;

  private Provider<PreferencesHelper> preferencesHelperProvider;

  private Provider<DbOpenHelper> dbOpenHelperProvider;

  private Provider<DatabaseHelper> databaseHelperProvider;

  private Provider<RxEventBus> rxEventBusProvider;

  private DaggerTestComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideDataManagerProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvideDataManagerFactory.create(builder.applicationTestModule));

    this.syncServiceMembersInjector =
        SyncService_MembersInjector.create(provideDataManagerProvider);

    this.provideContextProvider =
        ApplicationTestModule_ProvideContextFactory.create(builder.applicationTestModule);

    this.provideApplicationProvider =
        ApplicationTestModule_ProvideApplicationFactory.create(builder.applicationTestModule);

    this.provideRibotsServiceProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvideRibotsServiceFactory.create(
                builder.applicationTestModule));

    this.preferencesHelperProvider =
        DoubleCheck.provider(PreferencesHelper_Factory.create(provideContextProvider));

    this.dbOpenHelperProvider =
        DoubleCheck.provider(
            DbOpenHelper_Factory.create(
                MembersInjectors.<DbOpenHelper>noOp(), provideContextProvider));

    this.databaseHelperProvider =
        DoubleCheck.provider(DatabaseHelper_Factory.create(dbOpenHelperProvider));

    this.rxEventBusProvider = DoubleCheck.provider(RxEventBus_Factory.create());
  }

  @Override
  public void inject(SyncService arg0) {
    syncServiceMembersInjector.injectMembers(arg0);
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
    return provideDataManagerProvider.get();
  }

  @Override
  public RxEventBus eventBus() {
    return rxEventBusProvider.get();
  }

  public static final class Builder {
    private ApplicationTestModule applicationTestModule;

    private Builder() {}

    public TestComponent build() {
      if (applicationTestModule == null) {
        throw new IllegalStateException(
            ApplicationTestModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerTestComponent(this);
    }

    public Builder applicationTestModule(ApplicationTestModule applicationTestModule) {
      this.applicationTestModule = Preconditions.checkNotNull(applicationTestModule);
      return this;
    }
  }
}
