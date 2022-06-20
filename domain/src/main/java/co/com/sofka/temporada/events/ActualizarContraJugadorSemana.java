package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.Semanas;

public class ActualizarContraJugadorSemana extends DomainEvent {

    private Semanas semanas;

    public ActualizarContraJugadorSemana(Semanas semanas) {
        super("co.com.sofka.temporada.events.ActualizarContraJugadorSemana");
        this.semanas = semanas;
    }

    public Semanas getSemanas() { return semanas; }
}
