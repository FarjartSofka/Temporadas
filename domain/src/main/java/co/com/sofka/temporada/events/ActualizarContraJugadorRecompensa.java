package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.CantidadRecompensa;

public class ActualizarContraJugadorRecompensa extends DomainEvent {

    private CantidadRecompensa cantidadRecompensa;

    public ActualizarContraJugadorRecompensa(CantidadRecompensa cantidadRecompensa) {
        super("co.com.sofka.temporada.events.ActualizarContraJugadorRecompensa");
        this.cantidadRecompensa = cantidadRecompensa;
    }

    public CantidadRecompensa getCantidadRecompensas() { return cantidadRecompensa; }
}
