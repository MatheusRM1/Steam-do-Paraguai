/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas-freitas
 */
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
