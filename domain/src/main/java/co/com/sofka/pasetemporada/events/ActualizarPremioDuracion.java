package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Duracion;

public class ActualizarPremioDuracion extends DomainEvent {

    private Duracion duracion;

    public ActualizarPremioDuracion(Duracion duracion) {
        super("co.com.sofka.pasetemporada.events.ActualizarPremioDuracion");
        this.duracion = duracion;
    }

    public Duracion getDuracion() { return duracion; }
}
