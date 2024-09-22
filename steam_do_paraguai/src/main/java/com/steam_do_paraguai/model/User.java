/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public abstract class User {

    private String nome;
    private String senha;
    private float saldo;
    private List<Jogo> jogos;
    private String type;
    

    public User(String n, String s, String a) throws UsuarioException {
        if (!valido(n, s)) {
            throw new UsuarioException();
        }

        this.nome = n;
        this.senha = s;
        this.jogos = new ArrayList();
        this.type = a;
    }

    public boolean valido(String n, String s) {
        String regex = "^[A-Za-z0-9]+$";
        String regexLetra = ".*[A-Za-z]+.*";

        Persistence<User> usuarioPersistence = new UsuarioPersistence();
        List<User> lista = usuarioPersistence.findAll();

        int existe = 0;
        
        for (User p : lista) {
            if (p.getNome().equals(n)) {
                   existe = 1;
            }
        }

        return n.matches(regex) && n.matches(regexLetra) && s.matches(regex) && existe == 0;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public String acessoAoSistema() {
        return this.type;
    }
    
    public void adicionaSaldo(float value){
        this.saldo += value;
    }
    
    public void removeSaldo(float value){
        this.saldo -= value;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public List<Jogo> getJogos()
    {
        return this.jogos;
    }
    
    public void setJogo(List<Jogo> jogo)
    {
        this.jogos = jogo;
    }
    
}
