/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.model;

import com.steam_do_paraguai.exception.CupomException;


public abstract class Cupom implements Desconto {
    private String codigoCupom;
    private float valorDesconto;
    
    /***
     * Construtor que faz com que o codigo do cupom tenha obrigatoriamente uma letra e 3 digitos, fazendo o valor do desconto ser referente aos 3 digitos.
     * @param codigoCupom
     * @throws CupomException 
     */
    public Cupom(String codigoCupom) throws CupomException
    {
        codigoCupom = codigoCupom.toUpperCase();
        if(!codigoCupom.matches("^[A-Z]\\d{3}$")) 
        {
            throw new CupomException();
        }
        this.codigoCupom = codigoCupom;
        this.valorDesconto = Float.parseFloat(codigoCupom.split("\\D+")[1]); //Pega os numeros da string
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
    
    
    @Override //Faz com que todos os filhos da classe abstrata cupom tenham que implementar o metodo calculaDesconto da interface Desconto
    public abstract float calculaDesconto(float valorTotal);

    @Override
    public String toString() {
        return "Código do cupom: " + this.codigoCupom;
    }
    
    
}
