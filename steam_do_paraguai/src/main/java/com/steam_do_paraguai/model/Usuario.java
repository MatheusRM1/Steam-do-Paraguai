/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Usuario extends User{

    private int saldo;
    
    
    public Usuario(String n, String s, String a) throws UsuarioException{
        super(n, s, a);
    }
    
    public void adicionaSaldo(int altera){
        this.saldo += saldo;
    }
    
    public void removeSaldo(int altera){
        this.saldo -= saldo;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void adicionaJogo(){
       
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ", Senha: " + this.getSenha() + ", Acesso: " + acessoAoSistema();
    }    
    
}
