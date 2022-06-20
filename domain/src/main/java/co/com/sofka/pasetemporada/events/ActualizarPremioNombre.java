package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarPremioNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarPremioNombre(Nombre nombre) {
        super("co.com.sofka.pasetemporada.events.ActualizarPremioNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
