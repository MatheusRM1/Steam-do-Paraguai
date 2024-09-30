/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.persistence;

import java.util.List;

public interface Persistence<T> {
    String DIRECTORY = "data";
    public void save(List<T> itens);
    public List<T> findAll();
}
