package com.ejemplo;

public class Supermercado implements MostrarStock{

    Lata l1;
    Lata l2;
    Lata l3;
    Lata l4;
    Lata l5;
    Lata l6;


    public Supermercado(){
        l1 = new Lata("Coca-Cola", 33, 123412354101l);
        l2 = new Lata("Coca-Cola Zero", 33, 123412354102l);
        l3 = new Lata("Coca-Cola", 33, 123412354105l);
        l4 = new Lata("Coca-Cola Zero", 33, 123412354106l);
        l5 = new Lata("Coca-Cola", 33, 123412354109l);
        l6 = new Lata("Coca-Cola Zero", 33, 123412354110l);
    }


    @Override
    public void nombreDelEstablecimiento() {
        System.out.println("Soy el Supermercado");
    }

    @Override
    public void escribetePorPantalla() {
        l1.escribetePorPantalla();
        l2.escribetePorPantalla();
        l3.escribetePorPantalla();
        l4.escribetePorPantalla();
        l5.escribetePorPantalla();
        l6.escribetePorPantalla();
    }

    @Override
    public void escribetePorPantallaResumido() {
        l1.escribetePorPantallaResumido();
        l2.escribetePorPantallaResumido();
        l3.escribetePorPantallaResumido();
        l4.escribetePorPantallaResumido();
        l5.escribetePorPantallaResumido();
        l6.escribetePorPantallaResumido();
    }
}
