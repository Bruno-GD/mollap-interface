package edu.poniperro.mollapintercepting.targets;

public class Vehicle implements Target {

    // constructor de la clase vehiculo
    public Vehicle(){
    }

    @Override
    public void execucio(String mensaje) {
        System.out.println(String.format("Puerta abierta %s !", mensaje));
    }
}
