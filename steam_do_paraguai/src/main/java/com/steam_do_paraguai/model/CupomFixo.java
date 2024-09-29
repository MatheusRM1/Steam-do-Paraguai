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
public class CupomFixo extends Cupom{
    
    public CupomFixo(String codigoCupom) throws CupomException
    {
        super(codigoCupom);
    }
    
    @Override
    public float desconto(float valorTotal) {
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
