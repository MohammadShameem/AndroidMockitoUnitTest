
package uk.co.ribot.androidboilerplate.data.model;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $$AutoValue_Ribot extends Ribot {

  private final Profile profile;

  $$AutoValue_Ribot(
      Profile profile) {
    if (profile == null) {
      throw new NullPointerException("Null profile");
    }
    this.profile = profile;
  }

  @Override
  public Profile profile() {
    return profile;
  }

  @Override
  public String toString() {
    return "Ribot{"
        + "profile=" + profile
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Ribot) {
      Ribot that = (Ribot) o;
      return (this.profile.equals(that.profile()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.profile.hashCode();
    return h;
  }

}
