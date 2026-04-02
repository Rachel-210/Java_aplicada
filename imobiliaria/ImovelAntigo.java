package com.unifsa.imobiliaria;

public class ImovelAntigo extends Imovel {
    private double desconto;

    public ImovelAntigo(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getPrecoVenda() {
        return getPreco() - desconto;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Desconto Imovel Antigo: R$ " + desconto);
        System.out.println("Preco Final: R$ " + getPrecoVenda());
    }
}
