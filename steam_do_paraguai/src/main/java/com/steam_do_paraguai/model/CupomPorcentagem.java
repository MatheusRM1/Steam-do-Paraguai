/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.CupomException;

/**
 *
 * @author lukas-freitas
 */
public class CupomPorcentagem extends Cupom implements Desconto {
    
    public CupomPorcentagem(String codigoCupom) throws CupomException
    {
        super(codigoCupom);
        if(!(Float.parseFloat(super.getCodigo().split("\\D+")[1]) <=100))
        {
            throw new CupomException();
        }
    }
    @Override
    public float desconto(float valorTotal) {
        return valorTotal - (valorTotal*this.getDesconto()/100);
    }

    @Override
    public String toString() {
        return super.toString() + " Porcentagem";
    }
    
    
    
}
