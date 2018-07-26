package uk.co.ribot.androidboilerplate.test.common.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import uk.co.ribot.androidboilerplate.data.DataManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideDataManagerFactory implements Factory<DataManager> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideDataManagerFactory(ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DataManager get() {
    return Preconditions.checkNotNull(
        module.provideDataManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DataManager> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideDataManagerFactory(module);
  }
}
