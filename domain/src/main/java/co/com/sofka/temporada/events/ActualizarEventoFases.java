package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.Fase;

public class ActualizarEventoFases extends DomainEvent {

    private Fase fase;

    public ActualizarEventoFases(Fase fase) {
        super("co.com.sofka.temporada.events.ActualizarEventoFases");
        this.fase = fase;
    }

    public Fase getFase() { return fase; }
}
