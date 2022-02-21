package edu.poniperro.mollapintercepting.filtres;

public class Autoritzacio implements Filtre {

    public Autoritzacio(){
    }

    @Override
    public void execucio(String mensaje) {
        System.out.println(String.format("Autorización OK para %s", mensaje));
    }
}
