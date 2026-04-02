package com.unifsa.festa;

public class CamaroteSuperior extends Vip {
    private double valorAdicionalSup;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSup){
        super(valor, valorAdicional);
        this.valorAdicionalSup = valorAdicionalSup;
    }
    
    public double getValorCamaroteSuperior() {
        return getValorVip() + valorAdicionalSup;
    }
}
