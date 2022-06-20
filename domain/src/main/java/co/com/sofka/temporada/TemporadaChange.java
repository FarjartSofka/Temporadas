package co.com.sofka.temporada;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.temporada.events.ContraEntornoCreado;
import co.com.sofka.temporada.events.ContraJugadorCreado;
import co.com.sofka.temporada.events.EventoCreado;

public class TemporadaChange extends EventChange {

    public TemporadaChange(Temporada temporada){

        apply((ContraEntornoCreado event)->{
            temporada.contraEntorno = new ContraEntorno(event.getContraEntornoId(),
                    event.getNombre(),
                    event.getSemanas(),
                    event.getCantidadRecompensa(),
                    event.getTituloPorAdquirir(),
                    event.getFase());
        });

        apply((ContraJugadorCreado event)->{
            temporada.contraJugador = new ContraJugador(event.getContraJugadorId(),
                    event.getNombre(),
                    event.getSemanas(),
                    event.getCantidadRecompensa(),
                    event.getTituloPorAdquirir(),
                    event.getFase());
        });

        apply((EventoCreado event)->{
            temporada.evento = new Evento(event.getEventoId(),
                    event.getNombre(),
                    event.getSemanas(),
                    event.getCantidadRecompensa(),
                    event.getTituloPorAdquirir(),
                    event.getFase());
        });
    }

}
