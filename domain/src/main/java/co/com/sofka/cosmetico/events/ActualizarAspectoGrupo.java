package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarAspectoGrupo extends DomainEvent {

    private Grupo grupo;

    public ActualizarAspectoGrupo(Grupo grupo) {
        super("co.com.sofka.cosmetico.events.ActualizarAspectoGrupo");
        this.grupo = grupo;
    }

    public Grupo getGrupo() { return grupo; }
}
