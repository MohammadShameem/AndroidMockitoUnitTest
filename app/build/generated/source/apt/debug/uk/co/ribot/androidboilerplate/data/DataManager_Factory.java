package uk.co.ribot.androidboilerplate.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper;
import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper;
import uk.co.ribot.androidboilerplate.data.remote.RibotsService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManager_Factory implements Factory<DataManager> {
  private final Provider<RibotsService> ribotsServiceProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<DatabaseHelper> databaseHelperProvider;

  public DataManager_Factory(
      Provider<RibotsService> ribotsServiceProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<DatabaseHelper> databaseHelperProvider) {
    assert ribotsServiceProvider != null;
    this.ribotsServiceProvider = ribotsServiceProvider;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert databaseHelperProvider != null;
    this.databaseHelperProvider = databaseHelperProvider;
  }

  @Override
  public DataManager get() {
    return new DataManager(
        ribotsServiceProvider.get(), preferencesHelperProvider.get(), databaseHelperProvider.get());
  }

  public static Factory<DataManager> create(
      Provider<RibotsService> ribotsServiceProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<DatabaseHelper> databaseHelperProvider) {
    return new DataManager_Factory(
        ribotsServiceProvider, preferencesHelperProvider, databaseHelperProvider);
  }
}
