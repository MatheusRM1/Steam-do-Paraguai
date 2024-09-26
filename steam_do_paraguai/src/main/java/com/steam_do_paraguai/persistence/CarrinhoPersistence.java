package com.steam_do_paraguai.persistence;

import com.steam_do_paraguai.model.Carrinho;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.steam_do_paraguai.model.Jogo;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoPersistence implements Persistence<Jogo> {
    private static final String PATH = DIRECTORY + "/carrinho.json";

    @Override
    public void save(List<Jogo> itens){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        Arquivo.salva(PATH, json);
    }

    @Override
    public List<Jogo> findAll(){
        Gson gson = new GsonBuilder().create();
        String json = Arquivo.le(PATH);

        List<Jogo> jogos = new ArrayList<>();
        if (!json.trim().isEmpty()) {
            Type tipoLista = new TypeToken<List<Jogo>>() {}.getType();
            jogos = gson.fromJson(json, tipoLista);

            if (jogos == null) {
                jogos = new ArrayList<>();
            }
        }

        return jogos;
    }
}
