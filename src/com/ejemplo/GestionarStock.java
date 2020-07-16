package com.ejemplo;

import java.util.ArrayList;

public class GestionarStock {

    ArrayList<Bebida> listaDeBebidas = new ArrayList<>();

    public void addStock(ArrayList<Bebida> listaDeBebidas){
        this.listaDeBebidas.addAll(listaDeBebidas);
    }

    public boolean removeStock(int numeroDeBebidas){
        if (numeroDeBebidas > listaDeBebidas.size()){
            System.out.println("No hay suficientes bebidas.");
            return false;
        } else {
            this.listaDeBebidas.subList(0, numeroDeBebidas).clear();
            //for (int i = 0; i < numeroDeBebidas; i++) {
            //    this.listaDeBebidas.remove(0);
            //}
            System.out.println("Se han vendido " + numeroDeBebidas + " bebidas");
            return true;
        }
    }

    public void escribeBebidasConCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaConCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaConCafeina(Bebida bebida) {
        if (bebida.tieneCafeina()) {
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasSinCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinCafeina(Bebida bebida) {
        if (!bebida.tieneCafeina()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeBebidasSinGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinGas(Bebida bebida) {
        if (!bebida.tieneGas()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasConGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaConGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaConGas(Bebida bebida) {
        if (bebida.tieneGas()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasConAzucar() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaConAzucar(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaConAzucar(Bebida bebida) {
        if (bebida.tieneAzucar()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasSinAzucar() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinAzucar(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinAzucar(Bebida bebida) {
        if (!bebida.tieneAzucar()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasSinAzucarYSinCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinAzucarYSinCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinAzucarYSinCafeina(Bebida bebida) {
        if (bebida.noTieneAzucarNiCaifena()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeBebidasSinAzucarSinCafeinaSinGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinAzucarSinCafeinaSinGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinAzucarSinCafeinaSinGas(Bebida bebida) {
        if (bebida.noTieneAzucarNiCafeinaNiGas()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeBebidasSinAzucarSinCafeinaConCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeBebidaSinAzucarSinCafeinaConCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeBebidaSinAzucarSinCafeinaConCafeina(Bebida bebida) {
        if (bebida.noTieneAzucarNiCafeinaConGas()){
            bebida.escribetePorPantallaResumido();
        } else {
            bebida.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

}
