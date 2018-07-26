package uk.co.ribot.androidboilerplate.data.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

abstract class $AutoValue_Ribot extends $$AutoValue_Ribot {
  $AutoValue_Ribot(Profile profile) {
    super(profile);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Ribot> {
    private final TypeAdapter<Profile> profileAdapter;
    public GsonTypeAdapter(Gson gson) {
      this.profileAdapter = gson.getAdapter(Profile.class);
    }
    @Override
    public void write(JsonWriter jsonWriter, Ribot object) throws IOException {
      jsonWriter.beginObject();
      jsonWriter.name("profile");
      profileAdapter.write(jsonWriter, object.profile());
      jsonWriter.endObject();
    }
    @Override
    public Ribot read(JsonReader jsonReader) throws IOException {
      jsonReader.beginObject();
      Profile profile = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.skipValue();
          continue;
        }
        switch (_name) {
          case "profile": {
            profile = profileAdapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Ribot(profile);
    }
  }
}
