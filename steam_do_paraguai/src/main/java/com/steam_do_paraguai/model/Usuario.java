/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.UsuarioException;
import java.util.ArrayList;
import java.util.List;

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
        if(this.saldo+value > 100000) //Foi definido um limite de 100.000 so para nao quebrar os JLabels e estragar a visualizaçao
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
