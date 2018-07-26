package uk.co.ribot.androidboilerplate.injection.component;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.ribot.androidboilerplate.data.DataManager;
import uk.co.ribot.androidboilerplate.injection.module.ActivityModule;
import uk.co.ribot.androidboilerplate.ui.main.MainActivity;
import uk.co.ribot.androidboilerplate.ui.main.MainActivity_MembersInjector;
import uk.co.ribot.androidboilerplate.ui.main.MainPresenter;
import uk.co.ribot.androidboilerplate.ui.main.MainPresenter_Factory;
import uk.co.ribot.androidboilerplate.ui.main.RibotsAdapter;
import uk.co.ribot.androidboilerplate.ui.main.RibotsAdapter_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerConfigPersistentComponent implements ConfigPersistentComponent {
  private Provider<DataManager> dataManagerProvider;

  private Provider<MainPresenter> mainPresenterProvider;

  private DaggerConfigPersistentComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.dataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.mainPresenterProvider =
        DoubleCheck.provider(
            MainPresenter_Factory.create(
                MembersInjectors.<MainPresenter>noOp(), dataManagerProvider));
  }

  @Override
  public ActivityComponent activityComponent(ActivityModule activityModule) {
    return new ActivityComponentImpl(activityModule);
  }

  public static final class Builder {
    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ConfigPersistentComponent build() {
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerConfigPersistentComponent(this);
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }

  private final class ActivityComponentImpl implements ActivityComponent {
    private final ActivityModule activityModule;

    private Provider<RibotsAdapter> ribotsAdapterProvider;

    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private ActivityComponentImpl(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      initialize();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {

      this.ribotsAdapterProvider =
          RibotsAdapter_Factory.create(MembersInjectors.<RibotsAdapter>noOp());

      this.mainActivityMembersInjector =
          MainActivity_MembersInjector.create(
              DaggerConfigPersistentComponent.this.mainPresenterProvider, ribotsAdapterProvider);
    }

    @Override
    public void inject(MainActivity mainActivity) {
      mainActivityMembersInjector.injectMembers(mainActivity);
    }
  }
}
