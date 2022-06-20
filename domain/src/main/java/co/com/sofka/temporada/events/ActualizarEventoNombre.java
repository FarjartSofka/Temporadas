package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarEventoNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarEventoNombre(Nombre nombre) {
        super("co.com.sofka.temporada.events.ActualizarEventoNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
