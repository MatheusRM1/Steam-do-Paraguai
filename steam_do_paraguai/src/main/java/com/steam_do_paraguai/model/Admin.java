/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;

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
