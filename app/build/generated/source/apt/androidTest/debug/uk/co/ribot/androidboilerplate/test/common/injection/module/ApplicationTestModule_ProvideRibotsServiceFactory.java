package uk.co.ribot.androidboilerplate.test.common.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import uk.co.ribot.androidboilerplate.data.remote.RibotsService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideRibotsServiceFactory
    implements Factory<RibotsService> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideRibotsServiceFactory(ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RibotsService get() {
    return Preconditions.checkNotNull(
        module.provideRibotsService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RibotsService> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideRibotsServiceFactory(module);
  }
}
