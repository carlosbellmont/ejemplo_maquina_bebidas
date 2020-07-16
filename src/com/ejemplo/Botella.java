package com.ejemplo;

public class Botella extends Bebida {

    public Botella(String marca, long codBarras){
        super(marca, 100, codBarras);
    }

    @Override
    public void escribetePorPantalla(){
        System.out.print("B" + marca + "B");
    }

    @Override
    public void escribetePorPantallaResumido(){
        System.out.print("B" + shortCode + "B");
    }

    @Override
    public void escribetePorPantallaCuandoNoSeCumplesLosRequisitos(){
        System.out.print("BX B");
    }


    @Override
    int getCoste() {
        return 2;
    }

    @Override
    int getIngreso() {
        return 5;
    }


}
