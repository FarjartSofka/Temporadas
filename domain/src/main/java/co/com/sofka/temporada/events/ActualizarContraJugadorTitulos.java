package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ActualizarContraJugadorTitulos extends DomainEvent {

    private TituloPorAdquirir tituloPorAdquirir;

    public ActualizarContraJugadorTitulos(TituloPorAdquirir tituloPorAdquirir) {
        super("co.com.sofka.temporada.events.ActualizarContraJugadorTitulos");
        this.tituloPorAdquirir = tituloPorAdquirir;
    }

    public TituloPorAdquirir getTituloAdquirir() { return tituloPorAdquirir; }
}
