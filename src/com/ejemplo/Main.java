package com.ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Maquina maquina = new Maquina();
        System.out.println("Mostrando todas las bebidas");
        maquina.escribetePorPantalla();
        maquina.escribetePorPantallaResumido();
        System.out.println("-----------------------------");

        System.out.println("¿Querido usuario, que quieres que te muestre?");
        System.out.println("1 - Solo bebidas con cafeina");
        System.out.println("2 - Solo bebidas sin cafeina");
        System.out.println("3 - Solo bebidas sin gas");
        System.out.println("4 - Solo bebidas con gas");
        System.out.println("5 - Solo bebidas azucaradas");
        System.out.println("6 - Solo bebidas sin azucar");
        System.out.println("7 - Solo bebidas sin azucar y sin cafeina");
        System.out.println("8 - Solo bebidas sin azucar y sin cafeina y sin gas");
        System.out.println("9 - Solo bebidas sin azucar y sin cafeina y con gas");

        System.out.println("Introduce un número del 1 al 8 para elegir tu opción");
        int numero = readIntFromKeyboard();

        switch (numero) {
            case 1: {
                System.out.println("Mostrando solo bebidas con cafeina");
                // Quiero que maquina me muestre las latas que tienen cafeina
                maquina.escribeLatasConCafeina();
                break;
            }
            case 2: {
                System.out.println("Mostrando solo bebidas sin cafeina");
                // Quiero que maquina me muestre las latas que no tienen cafeina
                maquina.escribeLatasSinCafeina();
                break;
            }
            case 3: {
                System.out.println("Mostrando solo bebidas sin gas");
                // Quiero que maquina me muestre las latas que tienen gas
                maquina.escribeLatasSinGas();
                break;
            }
            case 4:{
                System.out.println("Mostrando solo bebidas con gas");
                // Quiero que maquina me muestre las latas que tienen gas
                maquina.escribeLatasConGas();
                break;
            }
            case 5:{
                System.out.println("Solo bebidas azucaradas");
                // Quiero que maquina me muestre las latas que tienen azucar
                maquina.escribeLatasConAzucar();
                break;
            }
            case 6:{
                System.out.println("Mostrando solo bebidas sin azucar");
                // Quiero que maquina me muestre las latas que tienen azucar
                maquina.escribeLatasSinAzucar();
                break;
            }
            case 7:{
                System.out.println("Mostrando solo bebidas sin azucar y sin cafeina");
                // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina
                maquina.escribeLatasSinAzucarYSinCafeina();
                break;
            }
            case 8:{
                System.out.println("Mostrando solo bebidas sin azucar y sin cafeina y sin gas");
                // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina y no tiene gas
                maquina.escribeLatasSinAzucarSinCafeinaSinGas();
                break;
            }
            case 9:{
                System.out.println("Mostrando solo bebidas sin azucar y sin cafeina y con gas");
                // Quiero que maquina me muestre las latas que tienen azucar y tienen cafeina y tiene gas
                maquina.escribeLatasSinAzucarSinCafeinaConCafeina();
                break;
            }
            default: {
                System.out.println("Numero sin opcion. Me cierro. Adios");
            }
        }
    }


    private static int readIntFromKeyboard(){
        Integer result;
        Scanner keyboardReader = new Scanner(System.in);
        do {
            String selectedOption = keyboardReader.nextLine();
            try {
                result = Integer.parseInt(selectedOption);
            } catch (NumberFormatException e){
                System.out.println("El String introducido no es un número. Introduce un \"int\"");
                result = null;
            }
        } while (result == null);
        //keyboardReader.close();
        return result.intValue();
    }

}

