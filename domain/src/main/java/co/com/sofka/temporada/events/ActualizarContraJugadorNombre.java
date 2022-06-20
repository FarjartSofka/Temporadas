package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarContraJugadorNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarContraJugadorNombre(Nombre nombre) {
        super("co.com.sofka.temporada.events.ActualizarContraJugadorNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
