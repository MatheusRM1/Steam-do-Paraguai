/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.CupomException;

public class CupomFixo extends Cupom{
    
    public CupomFixo(String codigoCupom) throws CupomException
    {
        super(codigoCupom);
    }
    
    @Override
    public float calculaDesconto(float valorTotal) {
        if((valorTotal - this.getDesconto())>=0)
        {
            return valorTotal - this.getDesconto();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Fixo";
    }
    
    
    
}
