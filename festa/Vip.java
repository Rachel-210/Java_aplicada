package com.unifsa.festa;

public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip() {
        return getValor() + valorAdicional;
    }
    
    public double getValorAdicional() {
        return valorAdicional;
    }
}
