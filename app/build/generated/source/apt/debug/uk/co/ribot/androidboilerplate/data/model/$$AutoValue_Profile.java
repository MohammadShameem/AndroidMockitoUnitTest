
package uk.co.ribot.androidboilerplate.data.model;

import android.support.annotation.Nullable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $$AutoValue_Profile extends Profile {

  private final Name name;
  private final String email;
  private final String hexColor;
  private final Date dateOfBirth;
  private final String bio;
  private final String avatar;

  $$AutoValue_Profile(
      Name name,
      String email,
      String hexColor,
      Date dateOfBirth,
      @Nullable String bio,
      @Nullable String avatar) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (email == null) {
      throw new NullPointerException("Null email");
    }
    this.email = email;
    if (hexColor == null) {
      throw new NullPointerException("Null hexColor");
    }
    this.hexColor = hexColor;
    if (dateOfBirth == null) {
      throw new NullPointerException("Null dateOfBirth");
    }
    this.dateOfBirth = dateOfBirth;
    this.bio = bio;
    this.avatar = avatar;
  }

  @Override
  public Name name() {
    return name;
  }

  @Override
  public String email() {
    return email;
  }

  @Override
  public String hexColor() {
    return hexColor;
  }

  @Override
  public Date dateOfBirth() {
    return dateOfBirth;
  }

  @Nullable
  @Override
  public String bio() {
    return bio;
  }

  @Nullable
  @Override
  public String avatar() {
    return avatar;
  }

  @Override
  public String toString() {
    return "Profile{"
        + "name=" + name + ", "
        + "email=" + email + ", "
        + "hexColor=" + hexColor + ", "
        + "dateOfBirth=" + dateOfBirth + ", "
        + "bio=" + bio + ", "
        + "avatar=" + avatar
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Profile) {
      Profile that = (Profile) o;
      return (this.name.equals(that.name()))
           && (this.email.equals(that.email()))
           && (this.hexColor.equals(that.hexColor()))
           && (this.dateOfBirth.equals(that.dateOfBirth()))
           && ((this.bio == null) ? (that.bio() == null) : this.bio.equals(that.bio()))
           && ((this.avatar == null) ? (that.avatar() == null) : this.avatar.equals(that.avatar()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.email.hashCode();
    h *= 1000003;
    h ^= this.hexColor.hashCode();
    h *= 1000003;
    h ^= this.dateOfBirth.hashCode();
    h *= 1000003;
    h ^= (bio == null) ? 0 : this.bio.hashCode();
    h *= 1000003;
    h ^= (avatar == null) ? 0 : this.avatar.hashCode();
    return h;
  }

  static final class Builder extends Profile.Builder {
    private Name name;
    private String email;
    private String hexColor;
    private Date dateOfBirth;
    private String bio;
    private String avatar;
    Builder() {
    }
    Builder(Profile source) {
      this.name = source.name();
      this.email = source.email();
      this.hexColor = source.hexColor();
      this.dateOfBirth = source.dateOfBirth();
      this.bio = source.bio();
      this.avatar = source.avatar();
    }
    @Override
    public Profile.Builder setName(Name name) {
      this.name = name;
      return this;
    }
    @Override
    public Profile.Builder setEmail(String email) {
      this.email = email;
      return this;
    }
    @Override
    public Profile.Builder setHexColor(String hexColor) {
      this.hexColor = hexColor;
      return this;
    }
    @Override
    public Profile.Builder setDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }
    @Override
    public Profile.Builder setBio(@Nullable String bio) {
      this.bio = bio;
      return this;
    }
    @Override
    public Profile.Builder setAvatar(@Nullable String avatar) {
      this.avatar = avatar;
      return this;
    }
    @Override
    public Profile build() {
      String missing = "";
      if (name == null) {
        missing += " name";
      }
      if (email == null) {
        missing += " email";
      }
      if (hexColor == null) {
        missing += " hexColor";
      }
      if (dateOfBirth == null) {
        missing += " dateOfBirth";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Profile(
          this.name,
          this.email,
          this.hexColor,
          this.dateOfBirth,
          this.bio,
          this.avatar);
    }
  }

}
