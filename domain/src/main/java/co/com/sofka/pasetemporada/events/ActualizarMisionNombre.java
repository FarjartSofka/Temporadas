package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarMisionNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarMisionNombre(Nombre nombre) {
        super("co.com.sofka.pasetemporada.events.ActualizarMisionNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
