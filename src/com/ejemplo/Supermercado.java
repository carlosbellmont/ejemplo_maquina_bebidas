package com.ejemplo;

public class Supermercado extends GestionarStock implements MostrarStock {


    @Override
    public void nombreDelEstablecimiento() {
        System.out.println("Soy el Supermercado");
    }

    @Override
    public void escribetePorPantalla() {
        for (Lata lista : listaDeBebidas) {
            lista.escribetePorPantalla();
            System.out.println();
        }
    }

    @Override
    public void escribetePorPantallaResumido() {
        for (Lata lista : listaDeBebidas) {
            lista.escribetePorPantallaResumido();
            System.out.println();
        }
    }
}
