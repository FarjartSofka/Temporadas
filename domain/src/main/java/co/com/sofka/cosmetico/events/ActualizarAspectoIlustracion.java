package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarAspectoIlustracion extends DomainEvent {

    private Ilustracion ilustracion;

    public ActualizarAspectoIlustracion(Ilustracion ilustracion) {
        super("co.com.sofka.cosmetico.events.ActualizarAspectoIlustracion");
        this.ilustracion = ilustracion;
    }

    public Ilustracion getIlustracion() { return ilustracion; }
}
