package com.ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Maquina maquina = new Maquina();
        maquina.addStock(crearStockMaquina());
        maquina.escribirInformeFinanciero();
        maquina.removeStock(2);
        maquina.escribirInformeFinanciero();

        Supermercado supermercado = new Supermercado();
        supermercado.addStock(crearStockSupermercado());
        maquina.escribirInformeFinanciero();
        supermercado.removeStock(6);
        supermercado.escribirInformeFinanciero();

        ArrayList<MostrarStock> listaEstablecimientos = new ArrayList<>();
        listaEstablecimientos.add(maquina);
        listaEstablecimientos.add(supermercado);

        for (MostrarStock establecimiento : listaEstablecimientos) {
            establecimiento.nombreDelEstablecimiento();
            establecimiento.escribetePorPantalla();
            System.out.println();
            establecimiento.escribetePorPantallaResumido();
            System.out.println();
        }
    }

    private static ArrayList<Botella> crearBotellas(){
        ArrayList<Botella> listaBotellas = new ArrayList<>();
        listaBotellas.add(new Botella("Coca-Cola", 123412354101l));
        listaBotellas.add(new Botella("Coca-Cola Zero", 123412354102l));
        listaBotellas.add(new Botella("Coca-Cola", 123412354105l));
        listaBotellas.add(new Botella("Coca-Cola Zero", 123412354106l));
        listaBotellas.add(new Botella("Coca-Cola", 123412354109l));
        listaBotellas.add(new Botella("Coca-Cola Zero", 123412354110l));
        return listaBotellas;
    }

    private static ArrayList<Bebida> crearStockMaquina(){
        ArrayList<Bebida> listaBebidas = new ArrayList<>();
        listaBebidas.add(new Lata("Coca-Cola", 123412354101l));
        listaBebidas.add(new Lata("Coca-Cola Zero", 123412354102l));
        listaBebidas.add(new Lata("Aquarius", 23412354103l));
        listaBebidas.add(new Lata("Aquarius Zero", 123412354104l));
        listaBebidas.add(new Lata("Coca-Cola", 123412354105l));
        listaBebidas.add(new Lata("Coca-Cola Zero", 123412354106l));
        listaBebidas.add(new Lata("Aquarius", 123412354107l));
        listaBebidas.add(new Lata("Aquarius Zero", 123412354108l));
        listaBebidas.add(new Lata("Coca-Cola", 123412354109l));
        listaBebidas.add(new Lata("Coca-Cola Zero", 123412354110l));
        listaBebidas.add(new Lata("Aquarius", 123412354111l));
        listaBebidas.add(new Lata("Aquarius Zero", 123412354112l));

        listaBebidas.addAll(crearBotellas());
        return listaBebidas;
    }

    private static ArrayList<Bebida> crearStockSupermercado(){
        ArrayList<Bebida> listaLatas = new ArrayList<>();
        listaLatas.add(new Lata("Coca-Cola", 123412354101l));
        listaLatas.add(new Lata("Coca-Cola Zero", 123412354102l));
        listaLatas.add(new Lata("Coca-Cola", 123412354105l));
        listaLatas.add(new Lata("Coca-Cola Zero", 123412354106l));
        listaLatas.add(new Lata("Coca-Cola", 123412354109l));
        listaLatas.add(new Lata("Coca-Cola Zero", 123412354110l));

        listaLatas.addAll(crearBotellas());
        return listaLatas;
    }


    private static void mostranContenidoMaquinaEsencial(Maquina maquina){
        System.out.println("Mostrando todas las bebidas de la máquina");
        maquina.escribetePorPantalla();
        maquina.escribetePorPantallaResumido();
        System.out.println("-----------------------------");
    }


    private static void mostranContenidoMaquina(Maquina maquina){
        mostranContenidoMaquinaEsencial(maquina);
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

        do {
            System.out.println("Introduce un número del 1 al 8 para elegir tu opción");
            int numero = readIntFromKeyboard();

            switch (numero) {
                case 1: {
                    System.out.println("Mostrando solo bebidas con cafeina");
                    // Quiero que maquina me muestre las latas que tienen cafeina
                    maquina.escribeBebidasConCafeina();
                    break;
                }
                case 2: {
                    System.out.println("Mostrando solo bebidas sin cafeina");
                    // Quiero que maquina me muestre las latas que no tienen cafeina
                    maquina.escribeBebidasSinCafeina();
                    break;
                }
                case 3: {
                    System.out.println("Mostrando solo bebidas sin gas");
                    // Quiero que maquina me muestre las latas que tienen gas
                    maquina.escribeBebidasSinGas();
                    break;
                }
                case 4:{
                    System.out.println("Mostrando solo bebidas con gas");
                    // Quiero que maquina me muestre las latas que tienen gas
                    maquina.escribeBebidasConGas();
                    break;
                }
                case 5:{
                    System.out.println("Solo bebidas azucaradas");
                    // Quiero que maquina me muestre las latas que tienen azucar
                    maquina.escribeBebidasConAzucar();
                    break;
                }
                case 6:{
                    System.out.println("Mostrando solo bebidas sin azucar");
                    // Quiero que maquina me muestre las latas que tienen azucar
                    maquina.escribeBebidasSinAzucar();
                    break;
                }
                case 7:{
                    System.out.println("Mostrando solo bebidas sin azucar y sin cafeina");
                    // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina
                    maquina.escribeBebidasSinAzucarYSinCafeina();
                    break;
                }
                case 8:{
                    System.out.println("Mostrando solo bebidas sin azucar y sin cafeina y sin gas");
                    // Quiero que maquina me muestre las latas que no tienen azucar y no tienen cafeina y no tiene gas
                    maquina.escribeBebidasSinAzucarSinCafeinaSinGas();
                    break;
                }
                case 9:{
                    System.out.println("Mostrando solo bebidas sin azucar y sin cafeina y con gas");
                    // Quiero que maquina me muestre las latas que tienen azucar y tienen cafeina y tiene gas
                    maquina.escribeBebidasSinAzucarSinCafeinaConCafeina();
                    break;
                }
                default: {
                    System.out.println("Numero sin opcion. Me cierro. Adios");
                    System.exit(0);
                }
            }
        } while (true);
    }


    private static String readStringFromKeyboard(){
        Scanner keyboardReader = new Scanner(System.in);
        return keyboardReader.nextLine();
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

