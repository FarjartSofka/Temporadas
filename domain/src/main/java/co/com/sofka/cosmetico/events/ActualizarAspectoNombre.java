package co.com.sofka.cosmetico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarAspectoNombre extends DomainEvent {

    private Nombre nombre;

    public ActualizarAspectoNombre(Nombre nombre) {
        super("co.com.sofka.cosmetico.events.ActualizarAspectoNombre");
        this.nombre = nombre;
    }

    public Nombre getNombre() { return nombre; }
}
