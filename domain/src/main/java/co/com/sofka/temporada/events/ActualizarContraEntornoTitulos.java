package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ActualizarContraEntornoTitulos extends DomainEvent {

    private TituloPorAdquirir tituloPorAdquirir;

    public ActualizarContraEntornoTitulos(TituloPorAdquirir tituloPorAdquirir) {
        super("co.com.sofka.temporada.events.ActualizarContraEntornoTitulos");
        this.tituloPorAdquirir = tituloPorAdquirir;
    }

    public TituloPorAdquirir getTituloAdquirir() { return tituloPorAdquirir; }
}
