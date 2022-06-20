package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.CantidadRecompensa;

public class ActualizarContraEntornoRecompensa extends DomainEvent {

    private CantidadRecompensa cantidadRecompensa;

    public ActualizarContraEntornoRecompensa(CantidadRecompensa cantidadRecompensa) {
        super("co.com.sofka.temporada.events.ActualizarContraEntornoRecompensa");
        this.cantidadRecompensa = cantidadRecompensa;
    }

    public CantidadRecompensa getCantidadRecompensas() { return cantidadRecompensa; }
}
