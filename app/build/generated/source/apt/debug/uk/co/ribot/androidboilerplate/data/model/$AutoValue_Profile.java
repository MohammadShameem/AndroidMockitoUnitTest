package uk.co.ribot.androidboilerplate.data.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

abstract class $AutoValue_Profile extends $$AutoValue_Profile {
  $AutoValue_Profile(Name name, String email, String hexColor, Date dateOfBirth, String bio, String avatar) {
    super(name, email, hexColor, dateOfBirth, bio, avatar);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Profile> {
    private final TypeAdapter<Name> nameAdapter;
    private final TypeAdapter<String> emailAdapter;
    private final TypeAdapter<String> hexColorAdapter;
    private final TypeAdapter<Date> dateOfBirthAdapter;
    private final TypeAdapter<String> bioAdapter;
    private final TypeAdapter<String> avatarAdapter;
    public GsonTypeAdapter(Gson gson) {
      this.nameAdapter = gson.getAdapter(Name.class);
      this.emailAdapter = gson.getAdapter(String.class);
      this.hexColorAdapter = gson.getAdapter(String.class);
      this.dateOfBirthAdapter = gson.getAdapter(Date.class);
      this.bioAdapter = gson.getAdapter(String.class);
      this.avatarAdapter = gson.getAdapter(String.class);
    }
    @Override
    public void write(JsonWriter jsonWriter, Profile object) throws IOException {
      jsonWriter.beginObject();
      jsonWriter.name("name");
      nameAdapter.write(jsonWriter, object.name());
      jsonWriter.name("email");
      emailAdapter.write(jsonWriter, object.email());
      jsonWriter.name("hexColor");
      hexColorAdapter.write(jsonWriter, object.hexColor());
      jsonWriter.name("dateOfBirth");
      dateOfBirthAdapter.write(jsonWriter, object.dateOfBirth());
      if (object.bio() != null) {
        jsonWriter.name("bio");
        bioAdapter.write(jsonWriter, object.bio());
      }
      if (object.avatar() != null) {
        jsonWriter.name("avatar");
        avatarAdapter.write(jsonWriter, object.avatar());
      }
      jsonWriter.endObject();
    }
    @Override
    public Profile read(JsonReader jsonReader) throws IOException {
      jsonReader.beginObject();
      Name name = null;
      String email = null;
      String hexColor = null;
      Date dateOfBirth = null;
      String bio = null;
      String avatar = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.skipValue();
          continue;
        }
        switch (_name) {
          case "name": {
            name = nameAdapter.read(jsonReader);
            break;
          }
          case "email": {
            email = emailAdapter.read(jsonReader);
            break;
          }
          case "hexColor": {
            hexColor = hexColorAdapter.read(jsonReader);
            break;
          }
          case "dateOfBirth": {
            dateOfBirth = dateOfBirthAdapter.read(jsonReader);
            break;
          }
          case "bio": {
            bio = bioAdapter.read(jsonReader);
            break;
          }
          case "avatar": {
            avatar = avatarAdapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Profile(name, email, hexColor, dateOfBirth, bio, avatar);
    }
  }
}
