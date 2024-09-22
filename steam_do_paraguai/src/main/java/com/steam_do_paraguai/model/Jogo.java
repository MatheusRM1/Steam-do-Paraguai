package com.steam_do_paraguai.model;

public class Jogo {
    private String nome;
    private String descricao;
    private String preco;

    public Jogo(String nome, String descricao, String preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getdescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Gênero: " + descricao + ", Preço: " + preco;
    }
}
