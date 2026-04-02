package com.unifsa.festa;
public class Festa {

    public static void main(String[] args) {

        System.out.println("=== INGRESSOS ===");
        Normal ingressoComum = new Normal(50.00);
        ingressoComum.imprimirIngresso();
        ingressoComum.imprimeValor();

        System.out.println();

        CamaroteInferior vipInferior = new CamaroteInferior(100.00, 50.00, "Setor Norte");
        System.out.println("Tipo: Camarote Inferior");
        System.out.println("Valor total: R$ " + vipInferior.getValorVip());
        vipInferior.Localizacao();

        System.out.println();

        CamaroteSuperior vipSuperior = new CamaroteSuperior(100.00, 50.00, 80.00);
        System.out.println("Tipo: Camarote Superior");
        System.out.println("Valor total final: R$ " + vipSuperior.getValorCamaroteSuperior());
    }
  }
