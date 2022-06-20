package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarMiscelaneoGrupo extends DomainEvent {

    private Grupo grupo;

    public ActualizarMiscelaneoGrupo(Grupo grupo) {
        super("co.com.sofka.cosmetico.events.ActualizarMiscelaneoGrupo");
        this.grupo = grupo;
    }

    public Grupo getGrupo() { return grupo; }
}
