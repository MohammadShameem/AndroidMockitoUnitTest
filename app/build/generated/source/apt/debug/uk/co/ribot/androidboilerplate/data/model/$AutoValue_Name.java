package uk.co.ribot.androidboilerplate.data.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

abstract class $AutoValue_Name extends $$AutoValue_Name {
  $AutoValue_Name(String first, String last) {
    super(first, last);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Name> {
    private final TypeAdapter<String> firstAdapter;
    private final TypeAdapter<String> lastAdapter;
    public GsonTypeAdapter(Gson gson) {
      this.firstAdapter = gson.getAdapter(String.class);
      this.lastAdapter = gson.getAdapter(String.class);
    }
    @Override
    public void write(JsonWriter jsonWriter, Name object) throws IOException {
      jsonWriter.beginObject();
      jsonWriter.name("first");
      firstAdapter.write(jsonWriter, object.first());
      jsonWriter.name("last");
      lastAdapter.write(jsonWriter, object.last());
      jsonWriter.endObject();
    }
    @Override
    public Name read(JsonReader jsonReader) throws IOException {
      jsonReader.beginObject();
      String first = null;
      String last = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.skipValue();
          continue;
        }
        switch (_name) {
          case "first": {
            first = firstAdapter.read(jsonReader);
            break;
          }
          case "last": {
            last = lastAdapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Name(first, last);
    }
  }
}
