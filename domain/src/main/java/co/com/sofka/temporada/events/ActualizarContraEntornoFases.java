package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.Fase;

public class ActualizarContraEntornoFases extends DomainEvent {

    private Fase fase;

    public ActualizarContraEntornoFases(Fase fase) {
        super("co.com.sofka.temporada.events.ActualizarContraEntornoFases");
        this.fase = fase;
    }

    public Fase getFase() { return fase; }
}
