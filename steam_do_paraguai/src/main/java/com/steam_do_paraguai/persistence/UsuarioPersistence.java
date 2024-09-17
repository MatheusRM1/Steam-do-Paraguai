/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.persistence;

import com.steam_do_paraguai.model.User;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 *
 * @author mathe
 */
public class UsuarioPersistence implements Persistence<User>{
    
    private static final String PATH = DIRECTORY +"/usuarios.json";
    @Override
    public void save(List<User> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<User> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<User> usuarios = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<User>>() {
            }.getType();
        usuarios = gson.fromJson(json, tipoLista);

            if (usuarios == null)
                usuarios = new ArrayList<>();
        }

        return usuarios;
    }
}
