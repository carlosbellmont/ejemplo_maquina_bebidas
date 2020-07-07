package com.ejemplo;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Usando la maquinaSinShortCode");
        Maquina maquina = new Maquina();
        maquina.escribetePorPantalla();
        maquina.escribetePorPantallaResumido();
        System.out.println("-----------------------------");



        System.out.println("Solo bebidas con cafeina");
        // Quiero que maquina me muestre las latas que tienen cafeina
        // |C ||CZ||X ||X |
        // |C ||CZ||X ||X |
        // |C ||CZ||X ||X |
        maquina.escribeLatasConCafeina();

        System.out.println("Solo bebidas sin cafeina");
        // Quiero que maquina me muestre las latas que no tienen cafeina
        // |X ||X ||A ||AZ|
        // |X ||X ||A ||AZ|
        // |X ||X ||A ||AZ|
        maquina.escribeLatasSinCafeina();

        // Quiero que maquina me muestre las latas que tienen gas

        // Quiero que maquina me muestre las latas que no tienen gas

        // Quiero que maquina me muestre las latas que tienen azucar

        // Quiero que maquina me muestre las latas que no tienen azucar

        // Quiero que maquina me muestre las latas que tienen azucar

        // Quiero que maquina me muestre las latas que no tienen azucar

        // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina

        // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina y no tiene gas

        // Quiero que maquina me muestre las latas que tienen azucar y tienen cafeina y tiene gas
        
        // Quiero que maquina me muestre las latas que tienen azucar y tienen cafeina y no tiene gas


    }
}

