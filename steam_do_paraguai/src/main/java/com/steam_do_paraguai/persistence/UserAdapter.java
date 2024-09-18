package com.steam_do_paraguai.persistence;

import com.google.gson.*;
import com.steam_do_paraguai.model.Admin;
import com.steam_do_paraguai.model.User;
import com.steam_do_paraguai.model.Usuario;
import java.lang.reflect.Type;

public class UserAdapter implements JsonDeserializer<User> {

    @Override
    public User deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        JsonObject jsonObject = json.getAsJsonObject();

        String type = jsonObject.get("type").getAsString();

        // Verifica o tipo de usuário e desserializa de acordo
        if (type.equals("Admin")) {
            return context.deserialize(json, Admin.class);
        } else if (type.equals("Usuario")) {
            return context.deserialize(json, Usuario.class);
        }

        // Se o tipo for desconhecido, lança uma exceção
        throw new JsonParseException("Tipo de usuário desconhecido: " + type);
    }
}
