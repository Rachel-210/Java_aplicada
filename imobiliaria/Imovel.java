package com.unifsa.imobiliaria;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void exibeDados() {
        System.out.println("Endereco: " + endereco);
        System.out.println("Preco: R$ " + preco);
    }
}
