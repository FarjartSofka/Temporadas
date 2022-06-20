package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarContraEntornoNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarContraEntornoNombre(Nombre nombre) {
        super("co.com.sofka.temporada.events.ActualizarContraEntornoNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
