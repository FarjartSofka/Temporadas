package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarArmaIlustracion extends DomainEvent {

    private Ilustracion ilustracion;

    public ActualizarArmaIlustracion(Ilustracion ilustracion) {
        super("co.com.sofka.cosmetico.events.ActualizarArmaIlustracion");
        this.ilustracion = ilustracion;
    }

    public Ilustracion getIlustracion() { return ilustracion; }
}
