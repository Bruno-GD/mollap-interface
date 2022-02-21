package edu.poniperro.mollapintercepting.clients;

import edu.poniperro.mollapintercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client {
    private ProgramadorTasques programador;

    public Mollapp() {}

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String mensaje) {
        programador.executarTasca(mensaje);
    }
}
