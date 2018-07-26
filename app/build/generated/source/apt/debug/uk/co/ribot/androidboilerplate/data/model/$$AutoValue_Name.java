
package uk.co.ribot.androidboilerplate.data.model;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $$AutoValue_Name extends Name {

  private final String first;
  private final String last;

  $$AutoValue_Name(
      String first,
      String last) {
    if (first == null) {
      throw new NullPointerException("Null first");
    }
    this.first = first;
    if (last == null) {
      throw new NullPointerException("Null last");
    }
    this.last = last;
  }

  @Override
  public String first() {
    return first;
  }

  @Override
  public String last() {
    return last;
  }

  @Override
  public String toString() {
    return "Name{"
        + "first=" + first + ", "
        + "last=" + last
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Name) {
      Name that = (Name) o;
      return (this.first.equals(that.first()))
           && (this.last.equals(that.last()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.first.hashCode();
    h *= 1000003;
    h ^= this.last.hashCode();
    return h;
  }

}
