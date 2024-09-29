/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.persistence.AdminPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.List;

/**
 *
 * @author mathe
 */
public abstract class User {

    private String nome;
    private String senha;
    private String type;
    
    public User(String n, String s, String a) throws UsuarioException {
        
        setNome(n);
        setSenha(s);
        this.type = a;
    }

    private boolean validoNome(String n) {
        String regex = "^[A-Za-z0-9]+$";
        String regexLetra = ".*[A-Za-z]+.*";
        
        
        if((!n.matches(regex) && !n.matches(regexLetra)) || n.contains(" "))
            return false;

        Persistence<Usuario> usuarioPersistence = new UsuarioPersistence();
        List<Usuario> listaUsuarios = usuarioPersistence.findAll();
        
        Persistence<Admin> adminPersistence = new AdminPersistence();
        List<Admin> listaAdmin = adminPersistence.findAll();
        
        for (Usuario p : listaUsuarios) {
            if (p.getNome().equals(n)) {
                   return false;
            }
        }
        
        for (Admin p : listaAdmin) {
            if (p.getNome().equals(n)) {
                   return false;
            }
        }

        return true;
    }
    
    private boolean validoSenha(String s){
        String regex = "^[A-Za-z0-9]+$";
        
        if(!s.matches(regex) || s.contains(" "))
            return false;
        
        return true;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setNome(String novoNome) throws UsuarioException{
        if(!validoNome(novoNome))
            throw new UsuarioException();
        
        this.nome = novoNome;
    }

    public void setSenha(String novaSenha) throws UsuarioException{
        if(!validoSenha(novaSenha))
            throw new UsuarioException();
        
        this.senha = novaSenha;
    }

    public String acessoAoSistema() {
        return this.type;
    }
    
    
}
