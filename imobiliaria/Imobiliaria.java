package com.unifsa.imobiliaria;

public class Imobiliaria {

    public static void main(String[] args) {
        System.out.println("--- Cadastro de Imoveis ---");

        ImovelNovo imovelNovo = new ImovelNovo("Av. Getulio Vargas, 1000", 500000.00, 75000.00);
        System.out.println("\nImovel Novo");
        imovelNovo.exibeDados();

        ImovelAntigo imovelAntigo = new ImovelAntigo("Rua Getulio Vargas, 50", 400000.00, 45000.00);
        System.out.println("\nImovel Antigo");
        imovelAntigo.exibeDados();
    }
}
