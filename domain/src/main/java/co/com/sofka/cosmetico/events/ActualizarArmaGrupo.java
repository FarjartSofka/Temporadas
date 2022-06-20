package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarArmaGrupo extends DomainEvent {

    private Grupo grupo;

    public ActualizarArmaGrupo(Grupo grupo) {
        super("co.com.sofka.cosmetico.events.ActualizarArmaGrupo");
        this.grupo = grupo;
    }

    public Grupo getGrupo() { return grupo; }
}
