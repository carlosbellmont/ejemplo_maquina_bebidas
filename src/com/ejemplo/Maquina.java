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
}
