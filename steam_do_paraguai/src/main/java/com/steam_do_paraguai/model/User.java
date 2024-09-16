/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

/**
 *
 * @author mathe
 */
public abstract class User {
    private String nome;
    private String senha;
    
    public User(String n, String s){
        this.nome = n;
        this.senha = s;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
     public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    
    public abstract String acessoAoSistema();
}
