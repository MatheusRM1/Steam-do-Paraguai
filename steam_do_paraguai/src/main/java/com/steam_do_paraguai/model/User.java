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
    private Carrinho carrinho;
    

    public User(String n, String s, String a) throws UsuarioException {
        
        setNome(n);
        setSenha(s);
        this.jogos = new ArrayList();
        this.type = a;
        this.carrinho = new Carrinho();
    }

    private boolean validoNome(String n) {
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

        return n.matches(regex) && n.matches(regexLetra) && existe == 0;
    }
    
    private boolean validoSenha(String s){
        String regex = "^[A-Za-z0-9]+$";
        
        return  s.matches(regex);
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
    
    public void adicionaSaldo(float value){
        this.saldo += value;
    }
    
    public void removeSaldo(float value){
        this.saldo -= value;
    }
    
    public void setSaldo(float value){
        this.saldo = value;
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
    
    public Carrinho getCarrinho()
    {
        return this.carrinho;
    }
}
