package uk.co.ribot.androidboilerplate.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Override;
import java.lang.String;

final class AutoValue_Name extends $AutoValue_Name {
  public static final Parcelable.Creator<AutoValue_Name> CREATOR = new Parcelable.Creator<AutoValue_Name>() {
    @Override
    public AutoValue_Name createFromParcel(Parcel in) {
      return new AutoValue_Name(
          in.readString(),
          in.readString()
      );
    }
    @Override
    public AutoValue_Name[] newArray(int size) {
      return new AutoValue_Name[size];
    }
  };

  AutoValue_Name(String first, String last) {
    super(first, last);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(first());
    dest.writeString(last());
  }

  @Override
  public int describeContents() {
    return 0;
  }
}
