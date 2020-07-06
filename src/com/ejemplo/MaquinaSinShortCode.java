package com.ejemplo;

public class MaquinaSinShortCode {

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

    public MaquinaSinShortCode(){
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
}
