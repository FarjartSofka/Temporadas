package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.CantidadRecompensa;

public class ActualizarEventoRecompensa extends DomainEvent {

    private CantidadRecompensa cantidadRecompensa;

    public ActualizarEventoRecompensa(CantidadRecompensa cantidadRecompensa) {
        super("co.com.sofka.temporada.events.ActualizarEventoRecompensa");
        this.cantidadRecompensa = cantidadRecompensa;
    }

    public CantidadRecompensa getCantidadRecompensas() { return cantidadRecompensa; }
}
