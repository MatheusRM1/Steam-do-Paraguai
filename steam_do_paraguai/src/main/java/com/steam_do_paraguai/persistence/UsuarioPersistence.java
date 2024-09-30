/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.persistence;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.steam_do_paraguai.model.Usuario;

public class UsuarioPersistence implements Persistence<Usuario>{
    
    private static final String PATH = DIRECTORY +"/usuarios.json";
    
    @Override
    public void save(List<Usuario> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<Usuario> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Usuario> usuarios = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Usuario>>() {
            }.getType();
        usuarios = gson.fromJson(json, tipoLista);

            if (usuarios == null)
                usuarios = new ArrayList<>();
        }

        return usuarios;
    }
}
