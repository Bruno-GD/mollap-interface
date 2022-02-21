package edu.poniperro.mollapintercepting.filtres;

public class Autenticacio implements Filtre {

    public Autenticacio(){
    }

    @Override
    public void execucio(String mensaje) {
        System.out.println(String.format("Autentifiacion OK para %s", mensaje));
    }
}
