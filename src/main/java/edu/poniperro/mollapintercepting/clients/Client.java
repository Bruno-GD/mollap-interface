package edu.poniperro.mollapintercepting.clients;

import edu.poniperro.mollapintercepting.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques programador);
    void enviarPeticio(String mensaje);
}
