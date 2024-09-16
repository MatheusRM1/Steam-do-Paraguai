/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Usuario extends User{

    private int saldo;
    private ArrayListt<Jogo> biblioteca;
    
    public Usuario(String n, String s) {
        super(n, s);
    }
    
    public void adicionaSaldo(int altera){
        this.saldo += saldo;
    }
    
    public void removeSaldo(int altera){
        this.saldo -= saldo;
    }
    
    public void adicionaJogo(Jogo joguinho){
        biblioteca.add(joguinho);
    }
    
    @Override
    public String acessoAoSistema(){
        return this.getNome();
    }
}
