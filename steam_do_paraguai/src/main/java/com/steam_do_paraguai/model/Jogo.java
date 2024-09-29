package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.JogoException;
import com.steam_do_paraguai.persistence.JogoPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import java.util.List;

public class Jogo {
    private String nome;
    private String descricao;
    private float preco;

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
    
    private boolean valido(String nome){
        
        if(nome == null || nome.isEmpty())
            return false;
        
        Persistence<Jogo> jogoPersistence = new JogoPersistence();
        List<Jogo> listaJogo = jogoPersistence.findAll();
        
        for (Jogo p : listaJogo) {
            if (p.getNome().equals(nome)) {
                   return false;
            }
        }
        
        return true;
    }

    public void setNome(String nome) throws JogoException {
        if(!valido(nome))
            throw new JogoException("O nome não pode ser nulo");
                    
        this.nome = nome;
    }

    public void setDescricao(String descricao) throws JogoException {
         if(descricao == null || descricao.isEmpty())
            throw new JogoException("A descrição não pode ser nula");
                
        this.descricao = descricao;
    }

    public void setPreco(float preco) throws JogoException {
        if(preco < 0)
            throw new JogoException("Preço inválido! Por favor, insira um valor válido");
        
        this.preco = preco;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
