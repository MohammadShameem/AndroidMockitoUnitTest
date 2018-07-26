package uk.co.ribot.androidboilerplate.util;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum RxEventBus_Factory implements Factory<RxEventBus> {
  INSTANCE;

  @Override
  public RxEventBus get() {
    return new RxEventBus();
  }

  public static Factory<RxEventBus> create() {
    return INSTANCE;
  }
}
