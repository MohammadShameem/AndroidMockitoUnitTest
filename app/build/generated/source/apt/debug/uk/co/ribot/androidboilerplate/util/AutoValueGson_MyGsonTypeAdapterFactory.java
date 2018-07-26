package uk.co.ribot.androidboilerplate.util;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.Override;
import java.lang.SuppressWarnings;
import uk.co.ribot.androidboilerplate.data.model.Name;
import uk.co.ribot.androidboilerplate.data.model.Profile;
import uk.co.ribot.androidboilerplate.data.model.Ribot;

public final class AutoValueGson_MyGsonTypeAdapterFactory extends MyGsonTypeAdapterFactory {
  @Override
  @SuppressWarnings("unchecked")
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<T> rawType = (Class<T>) type.getRawType();
    if (Name.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) Name.typeAdapter(gson);
    } else if (Profile.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) Profile.typeAdapter(gson);
    } else if (Ribot.class.isAssignableFrom(rawType)) {
      return (TypeAdapter<T>) Ribot.typeAdapter(gson);
    } else {
      return null;
    }
  }
}
