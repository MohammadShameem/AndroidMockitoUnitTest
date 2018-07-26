package uk.co.ribot.androidboilerplate.ui.main;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RibotsAdapter_Factory implements Factory<RibotsAdapter> {
  private final MembersInjector<RibotsAdapter> ribotsAdapterMembersInjector;

  public RibotsAdapter_Factory(MembersInjector<RibotsAdapter> ribotsAdapterMembersInjector) {
    assert ribotsAdapterMembersInjector != null;
    this.ribotsAdapterMembersInjector = ribotsAdapterMembersInjector;
  }

  @Override
  public RibotsAdapter get() {
    return MembersInjectors.injectMembers(ribotsAdapterMembersInjector, new RibotsAdapter());
  }

  public static Factory<RibotsAdapter> create(
      MembersInjector<RibotsAdapter> ribotsAdapterMembersInjector) {
    return new RibotsAdapter_Factory(ribotsAdapterMembersInjector);
  }
}
