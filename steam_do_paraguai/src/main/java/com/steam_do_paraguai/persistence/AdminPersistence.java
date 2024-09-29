/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.steam_do_paraguai.model.Admin;
import static com.steam_do_paraguai.persistence.Persistence.DIRECTORY;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus-PC
 */
public class AdminPersistence implements Persistence<Admin>{
    private static final String PATH = DIRECTORY +"/admins.json";
    
    @Override
    public void save(List<Admin> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<Admin> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Admin> usuarios = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Admin>>() {
            }.getType();
        usuarios = gson.fromJson(json, tipoLista);

            if (usuarios == null)
                usuarios = new ArrayList<>();
        }

        return usuarios;
    }
}
