package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Duracion;

public class ActualizarTematicaDuracion extends DomainEvent {

    private Duracion duracion;

    public ActualizarTematicaDuracion(Duracion duracion) {
        super("co.com.sofka.pasetemporada.events.ActualizarTematicaDuracion");
        this.duracion = duracion;
    }

    public Duracion getDuracion() { return duracion; }
}
