/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import java.util.ArrayList;
import java.util.List;

public  class Carrinho {
    private List<Jogo> jogos;
    
    public Carrinho()
    {
        this.jogos =  new ArrayList();
    }
    
    public void adicionaJogo(Jogo game)
    {
       this.jogos.add(game);
    }
    
    public void removeJogo(Jogo game)
    {
        this.jogos.remove(game);
    }
    
    public List<Jogo> getJogos()
    {
        return this.jogos;
    }
}
