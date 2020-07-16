package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class GestionarStock {

    ArrayList<Bebida> listaDeBebidas = new ArrayList<>();

    int ingreso = 0;
    int coste = 0;


    public int getBeneficio(){
        return ingreso - coste;
    }
    public int getIngresos(){
        return ingreso;
    }
    public int getCostes(){
        return coste;
    }

    public void escribirInformeFinanciero(){
        System.out.println("**********************INFORME FINANCIERO************************* ");
        System.out.println("Los costes actualmente son de " + getCostes());
        System.out.println("Los ingresos actualmente son de " + getIngresos());
        System.out.println("Los beneficios actualmente son de " + getBeneficio());
        System.out.println("***************************************************************** ");

    }

    public void addStock(ArrayList<Bebida> listaDeBebidas){
        for (Bebida bebida : listaDeBebidas){
            coste = coste + bebida.getCoste();
        }
        this.listaDeBebidas.addAll(listaDeBebidas);
    }

    public boolean removeStock(int numeroDeBebidas){
        if (numeroDeBebidas > listaDeBebidas.size()){
            System.out.println("No hay suficientes bebidas.");
            return false;
        } else {
            List<Bebida> listaDeVentas = this.listaDeBebidas.subList(0, numeroDeBebidas);
            for (Bebida bebida : listaDeVentas){
                ingreso = ingreso + bebida.getIngreso();
            }
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
