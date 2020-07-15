package com.ejemplo;

import java.util.ArrayList;

public class Maquina implements GestionarStock {

    ArrayList<Lata> listaLatas = new ArrayList<>();

    public Maquina(){
        listaLatas.add(new Lata("Coca-Cola", 33, 123412354101l));
        listaLatas.add(new Lata("Coca-Cola Zero", 33, 123412354102l));
        listaLatas.add(new Lata("Aquarius", 33, 123412354103l));
        listaLatas.add(new Lata("Aquarius Zero", 33, 123412354104l));
        listaLatas.add(new Lata("Coca-Cola", 33, 123412354105l));
        listaLatas.add(new Lata("Coca-Cola Zero", 33, 123412354106l));
        listaLatas.add(new Lata("Aquarius", 33, 123412354107l));
        listaLatas.add(new Lata("Aquarius Zero", 33, 123412354108l));
        listaLatas.add(new Lata("Coca-Cola", 33, 123412354109l));
        listaLatas.add(new Lata("Coca-Cola Zero", 33, 123412354110l));
        listaLatas.add(new Lata("Aquarius", 33, 123412354111l));
        listaLatas.add(new Lata("Aquarius Zero", 33, 123412354112l));

    }

    @Override
    public void nombreDelEstablecimiento() {
        System.out.println("Soy la maquina");
    }

    @Override
    public void escribetePorPantalla(){
        /*
        Este codigo es equivalente al de abajo
        for (int i = 0; i < listaLatas.size(); i++) {
            if (i != 0 && (i % 4 == 0)){
                System.out.println();
            }
            listaLatas.get(i).escribetePorPantalla();

        }
        System.out.println();*/
        for (int i = 0; i < listaLatas.size(); i++) {
            listaLatas.get(i).escribetePorPantalla();
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    @Override
    public void escribetePorPantallaResumido(){
        for (int i = 0; i < listaLatas.size(); i++) {
            listaLatas.get(i).escribetePorPantallaResumido();
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    public void escribeLatasConCafeina() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataConCafeina(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConCafeina(Lata lata) {
        if (lata.tieneCafeina()) {
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinCafeina() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinCafeina(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinCafeina(Lata lata) {
        if (!lata.tieneCafeina()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeLatasSinGas() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinGas(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinGas(Lata lata) {
        if (!lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConGas() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataConGas(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConGas(Lata lata) {
        if (lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConAzucar() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataConAzucar(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConAzucar(Lata lata) {
        if (lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucar() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinAzucar(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucar(Lata lata) {
        if (!lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarYSinCafeina() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinAzucarYSinCafeina(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarYSinCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCaifena()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeLatasSinAzucarSinCafeinaSinGas() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinAzucarSinCafeinaSinGas(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarSinCafeinaSinGas(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaNiGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarSinCafeinaConCafeina() {
        for (int i = 0; i < listaLatas.size(); i++) {
            escribeLataSinAzucarSinCafeinaConCafeina(listaLatas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarSinCafeinaConCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaConGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

}
