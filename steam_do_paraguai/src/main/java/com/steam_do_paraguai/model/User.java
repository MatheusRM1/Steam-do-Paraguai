/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.persistence.AdminPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.List;

public abstract class User {

    private String nome;
    private String senha;
    private String type;
    
    public User(String n, String s, String a) throws UsuarioException {
        
        setNome(n);
        setSenha(s);
        this.type = a;
    }
    /***
     * Valida o nome, devendo conter ao menos uma letra e pode conter numeros sem espaços
     * @param n
     * @return 
     */
    private boolean validoNome(String n) {
        String regex = "^[A-Za-z][A-Za-z0-9]*$";

    if (!n.matches(regex)) {
        return false;
    }

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
    /***
     * Valida a senha podendo conter qualquer caractere exceto o espaço
     * @param s
     * @return 
     */
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
    //O type e utilizado para identificar quem esta acessando o sistema sendo ou usuario ou admin
    public String acessoAoSistema() {
        return this.type;
    }
    
    
}
