package com.ejemplo;

import java.util.ArrayList;

public class Maquina extends GestionarStock implements MostrarStock {



    public void addStock(ArrayList<Bebida> listaDeBebidas){
        ArrayList<Lata> listaDeLatas = new ArrayList<>();
        for (Bebida bebida : listaDeBebidas) {
            coste = coste + bebida.getCoste();
            if (bebida instanceof Lata){
                listaDeLatas.add((Lata)bebida);
            }
        }

        this.listaDeBebidas.addAll(listaDeBebidas);
    }


    @Override
    public void nombreDelEstablecimiento() {
        System.out.println("Soy la maquina");
    }

    @Override
    public void escribetePorPantalla(){
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            listaDeBebidas.get(i).escribetePorPantalla();
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    @Override
    public void escribetePorPantallaResumido(){
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            listaDeBebidas.get(i).escribetePorPantallaResumido();
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

}
