package com.ejemplo;

public class Maquina extends GestionarStock implements MostrarStock {

    @Override
    public void nombreDelEstablecimiento() {
        System.out.println("Soy la maquina");
    }

    @Override
    public void escribetePorPantalla(){
        /*
        Este codigo es equivalente al de abajo
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            if (i != 0 && (i % 4 == 0)){
                System.out.println();
            }
            listaDeBebidas.get(i).escribetePorPantalla();

        }
        System.out.println();*/
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

    public void escribeLatasConCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataConCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConCafeina(Lata lata) {
        if (lata.tieneCafeina()) {
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinCafeina(Lata lata) {
        if (!lata.tieneCafeina()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeLatasSinGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinGas(Lata lata) {
        if (!lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataConGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConGas(Lata lata) {
        if (lata.tieneGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasConAzucar() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataConAzucar(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataConAzucar(Lata lata) {
        if (lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucar() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinAzucar(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucar(Lata lata) {
        if (!lata.tieneAzucar()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarYSinCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinAzucarYSinCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarYSinCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCaifena()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }


    public void escribeLatasSinAzucarSinCafeinaSinGas() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinAzucarSinCafeinaSinGas(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarSinCafeinaSinGas(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaNiGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

    public void escribeLatasSinAzucarSinCafeinaConCafeina() {
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            escribeLataSinAzucarSinCafeinaConCafeina(listaDeBebidas.get(i));
            if (i % 4 == 3){
                System.out.println();
            }
        }
    }

    private void escribeLataSinAzucarSinCafeinaConCafeina(Lata lata) {
        if (lata.noTieneAzucarNiCafeinaConGas()){
            lata.escribetePorPantallaResumido();
        } else {
            lata.escribetePorPantallaCuandoNoSeCumplesLosRequisitos();
        }
    }

}
