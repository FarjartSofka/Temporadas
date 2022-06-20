package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarArmaCalidad extends DomainEvent {

    private Calidad calidad;

    public ActualizarArmaCalidad(Calidad calidad) {
        super("co.com.sofka.cosmetico.events.ActualizarArmaCalidad");
        this.calidad = calidad;
    }

    public Calidad getCalidad() { return calidad; }
}
