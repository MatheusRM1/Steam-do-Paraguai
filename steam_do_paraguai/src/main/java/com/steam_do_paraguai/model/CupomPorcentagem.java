/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.CupomException;


public class CupomPorcentagem extends Cupom {
    
    public CupomPorcentagem(String codigoCupom) throws CupomException
    {
        super(codigoCupom);
        if(!(Float.parseFloat(super.getCodigo().split("\\D+")[1]) <=100)) //Verifica se o codigo do cupom e maior que 100% de desconto
        {
            throw new CupomException();
        }
    }
    @Override
    public float calculaDesconto(float valorTotal) {
        return valorTotal - (valorTotal*this.getDesconto()/100);
    }

    @Override
    public String toString() {
        return super.toString() + " Porcentagem";
    }
    
    
    
}
