package com.ejemplo;

public class Maquina {

    private Lata lata1;
    private Lata lata2;
    private Lata lata3;
    private Lata lata4;
    private Lata lata5;
    private Lata lata6;
    private Lata lata7;
    private Lata lata8;
    private Lata lata9;
    private Lata lata10;
    private Lata lata11;
    private Lata lata12;

    public Maquina(){
        lata1 = new Lata("Coca-Cola", 33, 123412354101l);
        lata2 = new Lata("Coca-Cola Zero", 33, 123412354102l);
        lata3 = new Lata("Aquarius", 33, 123412354103l);
        lata4 = new Lata("Aquarius Zero", 33, 123412354104l);
        lata5 = new Lata("Coca-Cola", 33, 123412354105l);
        lata6 = new Lata("Coca-Cola Zero", 33, 123412354106l);
        lata7 = new Lata("Aquarius", 33, 123412354107l);
        lata8 = new Lata("Aquarius Zero", 33, 123412354108l);
        lata9 = new Lata("Coca-Cola", 33, 123412354109l);
        lata10 = new Lata("Coca-Cola Zero", 33, 123412354110l);
        lata11 = new Lata("Aquarius", 33, 123412354111l);
        lata12 = new Lata("Aquarius Zero", 33, 123412354112l);
    }

    public void escribetePorPantalla(){
        lata1.escribetePorPantalla();
        lata2.escribetePorPantalla();
        lata3.escribetePorPantalla();
        lata4.escribetePorPantalla();
        System.out.println();
        lata5.escribetePorPantalla();
        lata6.escribetePorPantalla();
        lata7.escribetePorPantalla();
        lata8.escribetePorPantalla();
        System.out.println();
        lata9.escribetePorPantalla();
        lata10.escribetePorPantalla();
        lata11.escribetePorPantalla();
        lata12.escribetePorPantalla();
        System.out.println();
    }

    public void escribetePorPantallaResumido(){
        lata1.escribetePorPantallaResumido();
        lata2.escribetePorPantallaResumido();
        lata3.escribetePorPantallaResumido();
        lata4.escribetePorPantallaResumido();
        System.out.println();
        lata5.escribetePorPantallaResumido();
        lata6.escribetePorPantallaResumido();
        lata7.escribetePorPantallaResumido();
        lata8.escribetePorPantallaResumido();
        System.out.println();
        lata9.escribetePorPantallaResumido();
        lata10.escribetePorPantallaResumido();
        lata11.escribetePorPantallaResumido();
        lata12.escribetePorPantallaResumido();
        System.out.println();
    }

    public void escribeLatasConCafeina() {
        escribeLataConCafeina(lata1);
        escribeLataConCafeina(lata2);
        escribeLataConCafeina(lata3);
        escribeLataConCafeina(lata4);
        System.out.println();
        escribeLataConCafeina(lata5);
        escribeLataConCafeina(lata6);
        escribeLataConCafeina(lata7);
        escribeLataConCafeina(lata8);
        System.out.println();
        escribeLataConCafeina(lata9);
        escribeLataConCafeina(lata10);
        escribeLataConCafeina(lata11);
        escribeLataConCafeina(lata12);
        System.out.println();
    }

    private void escribeLataConCafeina(Lata lata) {
        if (lata.tieneCafeina()) {
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinCafeina() {
        escribeLataSinCafeina(lata1);
        escribeLataSinCafeina(lata2);
        escribeLataSinCafeina(lata3);
        escribeLataSinCafeina(lata4);
        System.out.println();
        escribeLataSinCafeina(lata5);
        escribeLataSinCafeina(lata6);
        escribeLataSinCafeina(lata7);
        escribeLataSinCafeina(lata8);
        System.out.println();
        escribeLataSinCafeina(lata9);
        escribeLataSinCafeina(lata10);
        escribeLataSinCafeina(lata11);
        escribeLataSinCafeina(lata12);
        System.out.println();
    }

    private void escribeLataSinCafeina(Lata lata) {
        if (!lata.tieneCafeina()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinGas() {
        escribeLataSinGas(lata1);
        escribeLataSinGas(lata2);
        escribeLataSinGas(lata3);
        escribeLataSinGas(lata4);
        System.out.println();
        escribeLataSinGas(lata5);
        escribeLataSinGas(lata6);
        escribeLataSinGas(lata7);
        escribeLataSinGas(lata8);
        System.out.println();
        escribeLataSinGas(lata9);
        escribeLataSinGas(lata10);
        escribeLataSinGas(lata11);
        escribeLataSinGas(lata12);
        System.out.println();
    }

    private void escribeLataSinGas(Lata lata) {
        if (!lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConGas() {
        escribeLataConGas(lata1);
        escribeLataConGas(lata2);
        escribeLataConGas(lata3);
        escribeLataConGas(lata4);
        System.out.println();
        escribeLataConGas(lata5);
        escribeLataConGas(lata6);
        escribeLataConGas(lata7);
        escribeLataConGas(lata8);
        System.out.println();
        escribeLataConGas(lata9);
        escribeLataConGas(lata10);
        escribeLataConGas(lata11);
        escribeLataConGas(lata12);
        System.out.println();
    }

    private void escribeLataConGas(Lata lata) {
        if (lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConAzucar() {
        escribeLataConAzucar(lata1);
        escribeLataConAzucar(lata2);
        escribeLataConAzucar(lata3);
        escribeLataConAzucar(lata4);
        System.out.println();
        escribeLataConAzucar(lata5);
        escribeLataConAzucar(lata6);
        escribeLataConAzucar(lata7);
        escribeLataConAzucar(lata8);
        System.out.println();
        escribeLataConAzucar(lata9);
        escribeLataConAzucar(lata10);
        escribeLataConAzucar(lata11);
        escribeLataConAzucar(lata12);
        System.out.println();
    }

    private void escribeLataConAzucar(Lata lata) {
        if (lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucar() {
        escribeLataSinAzucar(lata1);
        escribeLataSinAzucar(lata2);
        escribeLataSinAzucar(lata3);
        escribeLataSinAzucar(lata4);
        System.out.println();
        escribeLataSinAzucar(lata5);
        escribeLataSinAzucar(lata6);
        escribeLataSinAzucar(lata7);
        escribeLataSinAzucar(lata8);
        System.out.println();
        escribeLataSinAzucar(lata9);
        escribeLataSinAzucar(lata10);
        escribeLataSinAzucar(lata11);
        escribeLataSinAzucar(lata12);
        System.out.println();
    }

    private void escribeLataSinAzucar(Lata lata) {
        if (!lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarYSinCafeina() {
        escribeLataSinAzucarYSinCafeina(lata1);
        escribeLataSinAzucarYSinCafeina(lata2);
        escribeLataSinAzucarYSinCafeina(lata3);
        escribeLataSinAzucarYSinCafeina(lata4);
        System.out.println();
        escribeLataSinAzucarYSinCafeina(lata5);
        escribeLataSinAzucarYSinCafeina(lata6);
        escribeLataSinAzucarYSinCafeina(lata7);
        escribeLataSinAzucarYSinCafeina(lata8);
        System.out.println();
        escribeLataSinAzucarYSinCafeina(lata9);
        escribeLataSinAzucarYSinCafeina(lata10);
        escribeLataSinAzucarYSinCafeina(lata11);
        escribeLataSinAzucarYSinCafeina(lata12);
        System.out.println();
    }

    private void escribeLataSinAzucarYSinCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCaifena()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeLatasSinAzucarSinCafeinaSinGas() {
        escribeLataSinAzucarSinCafeinaSinGas(lata1);
        escribeLataSinAzucarSinCafeinaSinGas(lata2);
        escribeLataSinAzucarSinCafeinaSinGas(lata3);
        escribeLataSinAzucarSinCafeinaSinGas(lata4);
        System.out.println();
        escribeLataSinAzucarSinCafeinaSinGas(lata5);
        escribeLataSinAzucarSinCafeinaSinGas(lata6);
        escribeLataSinAzucarSinCafeinaSinGas(lata7);
        escribeLataSinAzucarSinCafeinaSinGas(lata8);
        System.out.println();
        escribeLataSinAzucarSinCafeinaSinGas(lata9);
        escribeLataSinAzucarSinCafeinaSinGas(lata10);
        escribeLataSinAzucarSinCafeinaSinGas(lata11);
        escribeLataSinAzucarSinCafeinaSinGas(lata12);
        System.out.println();
    }

    private void escribeLataSinAzucarSinCafeinaSinGas(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaNiGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarSinCafeinaConCafeina() {
        escribeLataSinAzucarSinCafeinaConCafeina(lata1);
        escribeLataSinAzucarSinCafeinaConCafeina(lata2);
        escribeLataSinAzucarSinCafeinaConCafeina(lata3);
        escribeLataSinAzucarSinCafeinaConCafeina(lata4);
        System.out.println();
        escribeLataSinAzucarSinCafeinaConCafeina(lata5);
        escribeLataSinAzucarSinCafeinaConCafeina(lata6);
        escribeLataSinAzucarSinCafeinaConCafeina(lata7);
        escribeLataSinAzucarSinCafeinaConCafeina(lata8);
        System.out.println();
        escribeLataSinAzucarSinCafeinaConCafeina(lata9);
        escribeLataSinAzucarSinCafeinaConCafeina(lata10);
        escribeLataSinAzucarSinCafeinaConCafeina(lata11);
        escribeLataSinAzucarSinCafeinaConCafeina(lata12);
        System.out.println();
    }

    private void escribeLataSinAzucarSinCafeinaConCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaConGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }
}
