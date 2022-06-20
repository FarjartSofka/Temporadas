package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarMiscelaneoIlustracion extends DomainEvent {

    private Ilustracion ilustracion;

    public ActualizarMiscelaneoIlustracion(Ilustracion ilustracion) {
        super("co.com.sofka.cosmetico.events.ActualizarMiscelaneoIlustracion");
        this.ilustracion = ilustracion;
    }

    public Ilustracion getIlustracion() { return ilustracion; }
}
