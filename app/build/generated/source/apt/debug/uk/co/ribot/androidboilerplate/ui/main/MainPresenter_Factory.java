package uk.co.ribot.androidboilerplate.ui.main;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.ribot.androidboilerplate.data.DataManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainPresenter_Factory implements Factory<MainPresenter> {
  private final MembersInjector<MainPresenter> mainPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public MainPresenter_Factory(
      MembersInjector<MainPresenter> mainPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert mainPresenterMembersInjector != null;
    this.mainPresenterMembersInjector = mainPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public MainPresenter get() {
    return MembersInjectors.injectMembers(
        mainPresenterMembersInjector, new MainPresenter(dataManagerProvider.get()));
  }

  public static Factory<MainPresenter> create(
      MembersInjector<MainPresenter> mainPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new MainPresenter_Factory(mainPresenterMembersInjector, dataManagerProvider);
  }
}
