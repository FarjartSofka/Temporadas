package co.com.sofka.cosmetico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarMiscelaneoNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarMiscelaneoNombre(Nombre nombre) {
        super("co.com.sofka.cosmetico.events.ActualizarMiscelaneoNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
