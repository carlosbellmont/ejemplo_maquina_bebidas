package com.ejemplo;

public class Lata extends Bebida {

    public Lata(String marca, long codBarras){
        super(marca, 33, codBarras);
    }

    @Override
    public void escribetePorPantalla(){
        System.out.print("|" + marca + "|");
    }

    @Override
    public void escribetePorPantallaResumido(){
        System.out.print("|" + shortCode + "|");
    }

    @Override
    public void escribetePorPantallaCuandoNoSeCumplesLosRequisitos(){
        System.out.print("|X |");
    }

    @Override
    int getCoste() {
        return 1;
    }

    @Override
    int getIngreso() {
        return 2;
    }

}
