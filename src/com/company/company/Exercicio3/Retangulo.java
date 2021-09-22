package com.company.company.Exercicio3;



public class Retangulo {


    public static void calculaArea (double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        System.out.println(area);
    }


    public static void calculaPerimetro (double ladoA, double ladoB) {
        double perimetro = (ladoA  + ladoB * 2);
        System.out.println(perimetro);
    }


    public static void quantidadePiso (double tamanhoPiso, double areaTotal) {
        double qtdLajotas = areaTotal / tamanhoPiso;
        System.out.println(Math.ceil(qtdLajotas));
    }

    public static void quantidadeRodape (double comprimentoPiso, double perimetro) {
        double quantidadeRodape = perimetro / comprimentoPiso;
        System.out.println(quantidadeRodape);

    }
}




