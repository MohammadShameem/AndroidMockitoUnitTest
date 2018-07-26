package uk.co.ribot.androidboilerplate.ui.main;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainPresenter> mMainPresenterProvider;

  private final Provider<RibotsAdapter> mRibotsAdapterProvider;

  public MainActivity_MembersInjector(
      Provider<MainPresenter> mMainPresenterProvider,
      Provider<RibotsAdapter> mRibotsAdapterProvider) {
    assert mMainPresenterProvider != null;
    this.mMainPresenterProvider = mMainPresenterProvider;
    assert mRibotsAdapterProvider != null;
    this.mRibotsAdapterProvider = mRibotsAdapterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainPresenter> mMainPresenterProvider,
      Provider<RibotsAdapter> mRibotsAdapterProvider) {
    return new MainActivity_MembersInjector(mMainPresenterProvider, mRibotsAdapterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mMainPresenter = mMainPresenterProvider.get();
    instance.mRibotsAdapter = mRibotsAdapterProvider.get();
  }

  public static void injectMMainPresenter(
      MainActivity instance, Provider<MainPresenter> mMainPresenterProvider) {
    instance.mMainPresenter = mMainPresenterProvider.get();
  }

  public static void injectMRibotsAdapter(
      MainActivity instance, Provider<RibotsAdapter> mRibotsAdapterProvider) {
    instance.mRibotsAdapter = mRibotsAdapterProvider.get();
  }
}
