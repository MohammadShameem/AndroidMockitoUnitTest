package uk.co.ribot.androidboilerplate.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Override;

final class AutoValue_Ribot extends $AutoValue_Ribot {
  public static final Parcelable.Creator<AutoValue_Ribot> CREATOR = new Parcelable.Creator<AutoValue_Ribot>() {
    @Override
    public AutoValue_Ribot createFromParcel(Parcel in) {
      return new AutoValue_Ribot(
          (Profile) in.readParcelable(Profile.class.getClassLoader())
      );
    }
    @Override
    public AutoValue_Ribot[] newArray(int size) {
      return new AutoValue_Ribot[size];
    }
  };

  AutoValue_Ribot(Profile profile) {
    super(profile);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeParcelable(profile(), flags);
  }

  @Override
  public int describeContents() {
    return 0;
  }
}
