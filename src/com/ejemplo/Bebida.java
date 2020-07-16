package com.ejemplo;

public abstract class Bebida {

    public String marca;
    public int cantidadDeBebida;
    public long codBarras;
    public String shortCode;

    public Bebida(String marca, int cantidadDeBebida, long codBarras){
        this.marca = marca;
        this.cantidadDeBebida = cantidadDeBebida;
        this.codBarras = codBarras;
        rellenarShortCodeConSwitch();
    }

    abstract void escribetePorPantalla();
    abstract void escribetePorPantallaResumido();
    abstract void escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
    abstract int getCoste();
    abstract int getIngreso();


    private void rellenarShortCodeConSwitch() {
        switch (marca) {
            case "Coca-Cola":{
                this.shortCode = "C ";
                break;
            }
            case "Coca-Cola Zero":{
                this.shortCode = "CZ";
                break;
            }
            case "Aquarius":{
                this.shortCode = "A ";
                break;
            }
            case "Aquarius Zero":{
                this.shortCode = "AZ";
                break;
            }
            default:{
                this.shortCode = "¿?";
            }
        }
    }

    public boolean tieneCafeina(){
        return marca.contentEquals("Coca-Cola") || marca.contentEquals("Coca-Cola Zero");
    }

    public boolean tieneGas(){
        return marca.contentEquals("Coca-Cola") || marca.contentEquals("Coca-Cola Zero");
    }

    public boolean tieneAzucar(){
        return !marca.contains("Zero");
    }

    public boolean noTieneAzucarNiCaifena() {
        return !tieneAzucar() && !tieneCafeina();
    }

    public boolean noTieneAzucarNiCafeinaNiGas() {
        return !tieneAzucar() && !tieneCafeina() && !tieneGas();
    }

    public boolean noTieneAzucarNiCafeinaConGas() {
        return !tieneAzucar() && !tieneCafeina() && tieneGas();
    }

}
