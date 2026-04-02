package com.unifsa.festa;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void Localizacao() {
        System.out.println("Localizacao: " + localizacao);
    }
}
