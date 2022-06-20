package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.Semanas;

public class ActualizarEventoSemana extends DomainEvent {

    private Semanas semanas;

    public ActualizarEventoSemana(Semanas semanas) {
        super("co.com.sofka.temporada.events.ActualizarEventoSemana");
        this.semanas = semanas;
    }

    public Semanas getSemanas() { return semanas; }
}
