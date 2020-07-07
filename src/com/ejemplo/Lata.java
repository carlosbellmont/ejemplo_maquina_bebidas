package com.ejemplo;

public class Lata {

    public String marca;
    public int cantidadDeBebida;
    public long codBarras;
    public String shortCode;

    public Lata(String marca, int cantidadDeBebida, long codBarras){
        this.marca = marca;
        this.cantidadDeBebida = cantidadDeBebida;
        this.codBarras = codBarras;
        rellenarShortCodeConIf();
    }

    public Lata(String marca, int cantidadDeBebida, long codBarras, String shortCode){
        this.marca = marca;
        this.cantidadDeBebida = cantidadDeBebida;
        this.codBarras = codBarras;
        this.shortCode = shortCode;
    }

    private void rellenarShortCodeConIf() {
        if (marca.contentEquals("Coca-Cola")){
            this.shortCode = "C ";
        } else if (marca.contentEquals("Coca-Cola Zero")) {
            this.shortCode = "CZ";
        } else if (marca.contentEquals("Aquarius")){
            this.shortCode = "A ";
        } else if (marca.contentEquals("Aquarius Zero")) {
            this.shortCode = "AZ";
        } else {
            this.shortCode = "¿?";
        }
    }


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

    public void escribetePorPantalla(){
        System.out.print("|" + marca + "|");
    }

    public void escribetePorPantallaResumido(){
        System.out.print("|" + shortCode + "|");
    }

    public void escribetePorPantallaCuandoNoSeCumplesLosRequisitos(){
        System.out.print("|X |");
    }

    public boolean tieneAzucar(){
        return false;
    }

    public boolean tieneCafeina(){
        // Este IF es equivalente al siguiente pero lo simplificamos
        // if (marca.contentEquals("Coca-Cola") || marca.contentEquals("Coca-Cola Zero")){
        //    return true;
        //} else if (marca.contentEquals("Aquarius") || marca.contentEquals("Aquarius Zero")) {
        //    return false;
        //}
        //return false;
        if (marca.contentEquals("Coca-Cola") || marca.contentEquals("Coca-Cola Zero")){
            return true;
        } else {
            return false;
        }
        // Esta código es equivalente al anterior pero más resumido
        // return marca.contentEquals("Coca-Cola") || marca.contentEquals("Coca-Cola Zero");
    }

    public boolean tieneGas(){
        return false;
    }

}
