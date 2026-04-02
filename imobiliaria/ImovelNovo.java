package com.unifsa.imobiliaria;

public class ImovelNovo extends Imovel{
    private double adicional;

    public ImovelNovo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getPrecoVenda() {
        return getPreco() + adicional;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Adicional Imovel Novo: R$ " + adicional);
        System.out.println("Preco Final: R$ " + getPrecoVenda());
    }
}
