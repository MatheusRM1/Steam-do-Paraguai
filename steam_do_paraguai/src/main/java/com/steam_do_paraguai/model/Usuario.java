/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Usuario extends User {

    private float saldo;
    private Carrinho carrinho;
    private List<Jogo> jogos;

    public Usuario(String n, String s, String a) throws UsuarioException {
        super(n, s, a);
        this.jogos = new ArrayList();
        this.carrinho = new Carrinho();
        this.saldo = 0;
    }

    public void adicionaSaldo(float value) {
        if(this.saldo+value > 100000)
        {
            this.saldo = 100000;
        }
        else
        {
            this.saldo += value;
        }
    }

    public void removeSaldo(float value) {
        this.saldo -= value;
    }

    public void setSaldo(float value) {
        if(value<= 100000)
        {
            this.saldo = value;
        }
        else
        {
            this.saldo = 100000;
        }
        
    }

    public float getSaldo() {
        return this.saldo;
    }

    public List<Jogo> getJogos() {
        return this.jogos;
    }

    public void setJogo(List<Jogo> jogo) {
        this.jogos = jogo;
    }

    public Carrinho getCarrinho() {
        return this.carrinho;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Senha: " + this.getSenha() + ", Acesso: " + acessoAoSistema();
    }

}
