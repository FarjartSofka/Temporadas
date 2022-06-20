package co.com.sofka.cosmetico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarArmaNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarArmaNombre(Nombre nombre) {
        super("co.com.sofka.cosmetico.events.ActualizarArmaNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
