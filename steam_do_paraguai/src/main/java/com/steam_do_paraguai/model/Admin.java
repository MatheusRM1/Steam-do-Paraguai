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
public class Admin extends User{

    public Admin(String n, String s, String a) throws UsuarioException {
        super(n, s, a);
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ", Senha: " + this.getSenha() + ", Acesso: " + acessoAoSistema();
    }  
}
