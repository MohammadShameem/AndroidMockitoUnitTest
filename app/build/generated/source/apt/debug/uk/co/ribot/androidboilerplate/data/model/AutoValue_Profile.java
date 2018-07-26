package uk.co.ribot.androidboilerplate.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

final class AutoValue_Profile extends $AutoValue_Profile {
  public static final Parcelable.Creator<AutoValue_Profile> CREATOR = new Parcelable.Creator<AutoValue_Profile>() {
    @Override
    public AutoValue_Profile createFromParcel(Parcel in) {
      return new AutoValue_Profile(
          (Name) in.readParcelable(Name.class.getClassLoader()),
          in.readString(),
          in.readString(),
          (Date) in.readSerializable(),
          in.readInt() == 0 ? in.readString() : null,
          in.readInt() == 0 ? in.readString() : null
      );
    }
    @Override
    public AutoValue_Profile[] newArray(int size) {
      return new AutoValue_Profile[size];
    }
  };

  AutoValue_Profile(Name name, String email, String hexColor, Date dateOfBirth, String bio, String avatar) {
    super(name, email, hexColor, dateOfBirth, bio, avatar);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeParcelable(name(), flags);
    dest.writeString(email());
    dest.writeString(hexColor());
    dest.writeSerializable(dateOfBirth());
    if (bio() == null) {
      dest.writeInt(1);
    } else {
      dest.writeInt(0);
      dest.writeString(bio());
    }
    if (avatar() == null) {
      dest.writeInt(1);
    } else {
      dest.writeInt(0);
      dest.writeString(avatar());
    }
  }

  @Override
  public int describeContents() {
    return 0;
  }
}
