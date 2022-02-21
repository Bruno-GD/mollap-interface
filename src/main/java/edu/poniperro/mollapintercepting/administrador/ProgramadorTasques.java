package edu.poniperro.mollapintercepting.administrador;

import edu.poniperro.mollapintercepting.filtres.Filtre;
import edu.poniperro.mollapintercepting.targets.Target;

public class ProgramadorTasques {
    private final Tasques tasques = new Tasques();

    public ProgramadorTasques(Target target) {
        tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return tasques;
    }

    public void setTasca(Filtre filtre) {
        tasques.afegirTasca(filtre);
    }

    public void executarTasca(String mensaje) {
        tasques.execucio(mensaje);
    }
}
