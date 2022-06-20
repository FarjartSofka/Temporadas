package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.Semanas;

public class ActualizarContraEntornoSemana extends DomainEvent {

    private Semanas semanas;

    public ActualizarContraEntornoSemana(Semanas semanas) {
        super("co.com.sofka.temporada.events.ActualizarContraEntornoSemana");
        this.semanas = semanas;
    }

    public Semanas getSemanas() { return semanas; }
}
