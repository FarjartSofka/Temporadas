package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarTematicaNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarTematicaNombre(Nombre nombre) {
        super("co.com.sofka.pasetemporada.events.ActualizarTematicaNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
