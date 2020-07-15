package com.ejemplo;

import java.util.ArrayList;

public class GestionarStock {

    ArrayList<Lata> listaDeBebidas = new ArrayList<>();

    public void addStock(ArrayList<Lata> listaDeBebidas){
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

}
