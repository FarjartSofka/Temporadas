package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Duracion;

public class ActualizarMisionDuracion extends DomainEvent {

    private Duracion duracion;

    public ActualizarMisionDuracion(Duracion duracion) {
        super("co.com.sofka.pasetemporada.events.ActualizarMisionDuracion");
        this.duracion = duracion;
    }

    public Duracion getDuracion() { return duracion; }
}
