package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarMiscelaneoCalidad extends DomainEvent {

    private Calidad calidad;

    public ActualizarMiscelaneoCalidad(Calidad calidad) {
        super("co.com.sofka.cosmetico.events.ActualizarMiscelaneoCalidad");
        this.calidad = calidad;
    }

    public Calidad getCalidad() { return calidad; }
}
