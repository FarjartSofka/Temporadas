package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarAspectoCalidad extends DomainEvent {

    private Calidad calidad;

    public ActualizarAspectoCalidad(Calidad calidad) {
        super("co.com.sofka.cosmetico.events.ActualizarAspectoCalidad");
        this.calidad = calidad;
    }

    public Calidad getCalidad() { return calidad; }
}
