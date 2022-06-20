package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ActualizarEventoTitulos extends DomainEvent {

    private TituloPorAdquirir tituloPorAdquirir;

    public ActualizarEventoTitulos(TituloPorAdquirir tituloPorAdquirir) {
        super("co.com.sofka.temporada.events.ActualizarEventoTitulos");
        this.tituloPorAdquirir = tituloPorAdquirir;
    }

    public TituloPorAdquirir getTituloAdquirir() { return tituloPorAdquirir; }
}
