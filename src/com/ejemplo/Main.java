package com.ejemplo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Usando la maquinaConShortCode");
        MaquinaConShortCode maquinaConShortCode = new MaquinaConShortCode();
        maquinaConShortCode.escribetePorPantalla();
        maquinaConShortCode.escribetePorPantallaResumido();
        System.out.println("-----------------------------");
        System.out.println("Usando la maquinaSinShortCode");
        MaquinaSinShortCode maquinaSinShortCode = new MaquinaSinShortCode();
        maquinaSinShortCode.escribetePorPantalla();
        maquinaSinShortCode.escribetePorPantallaResumido();
        System.out.println("-----------------------------");
    }
}

