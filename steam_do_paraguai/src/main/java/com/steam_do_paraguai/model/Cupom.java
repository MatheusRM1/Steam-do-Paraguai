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
public abstract class Cupom implements Desconto {
    private String codigoCupom;
    private float valorDesconto;
    
    public Cupom(String codigoCupom) throws CupomException
    {
        codigoCupom = codigoCupom.toUpperCase();
        if(!codigoCupom.matches("^[A-Z]\\d{3}$"))
        {
            throw new CupomException();
        }
        this.codigoCupom = codigoCupom;
        this.valorDesconto = Float.parseFloat(codigoCupom.split("\\D+")[1]);
    }
    
    public String getCodigo()
    {
        return this.codigoCupom;
    }
    
    public float getDesconto()
    {
        return this.valorDesconto;
    }
    
    public void setCodigo(String codigoCupom) throws CupomException
    {
        if(!codigoCupom.matches("^[A-Z]\\d{3}$"))
        {
            throw new CupomException();
        }
        this.codigoCupom = codigoCupom;
        this.valorDesconto = Float.parseFloat(codigoCupom.split("\\D+")[1]);
    }
    
    @Override
    public abstract float desconto(float valorTotal);

    @Override
    public String toString() {
        return "Código do cupom: " + this.codigoCupom;
    }
    
    
}
