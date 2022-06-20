package co.com.sofka.temporada;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.events.*;
import co.com.sofka.temporada.factory.TemporadaFactory;
import co.com.sofka.temporada.identities.ContraEntornoId;
import co.com.sofka.temporada.identities.ContraJugadorId;
import co.com.sofka.temporada.identities.EventoId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class Temporada extends AggregateEvent<TemporadaId>{

    protected ContraEntorno contraEntorno;

    protected ContraJugador contraJugador;

    protected Evento evento;

    public Temporada(TemporadaId temporadaId, ContraEntornoId contraEntornoId, Nombre nombre, Semanas semana,
                     CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase) {
        super(temporadaId);
        subscribe(new TemporadaChange(this));
        appendChange( new ContraEntornoCreado(contraEntornoId, nombre, semana, cantidadRecompensa, tituloPorAdquirir, fase)).apply();

    }


    public Temporada(TemporadaId temporadaId, ContraJugadorId contraJugadorId, Nombre nombre, Semanas semana,
                     CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase) {
        super(temporadaId);
        subscribe(new TemporadaChange(this));
        appendChange( new ContraJugadorCreado(contraJugadorId, nombre, semana, cantidadRecompensa, tituloPorAdquirir, fase)).apply();
    }

    public Temporada(TemporadaId temporadaId, EventoId eventoId, Nombre nombre, Semanas semana,
                     CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase) {
        super(temporadaId);
        subscribe(new TemporadaChange(this));
        appendChange( new EventoCreado(eventoId, nombre, semana, cantidadRecompensa, tituloPorAdquirir, fase)).apply();
    }

    public void actualizarContraEntornoNombre(Nombre nombre){
        appendChange(new ActualizarContraEntornoNombre(nombre)).apply();
    }

    public void actualizarContraJugadorNombre(Nombre nombre){
        appendChange(new ActualizarContraJugadorNombre(nombre)).apply();
    }

    public void actualizarEventoNombre(Nombre nombre){
        appendChange(new ActualizarEventoNombre(nombre)).apply();
    }

    public void actualizarContraEntornoFases(Fase fase){
        appendChange(new ActualizarContraEntornoFases(fase)).apply();
    }

    public void actualizarJugadorFases(Fase fase){
        appendChange(new ActualizarContraJugadorFases(fase)).apply();
    }

    public void actualizarEventoFases(Fase fase){
        appendChange(new ActualizarEventoFases(fase)).apply();
    }

    public void actualizarContraEntornoRecompensa(CantidadRecompensa recompensa){
        appendChange(new ActualizarContraEntornoRecompensa(recompensa)).apply();
    }

    public void actualizarJugadorRecompensa(CantidadRecompensa recompensa){
        appendChange(new ActualizarContraJugadorRecompensa(recompensa)).apply();
    }

    public void actualizarEventoRecompensa(CantidadRecompensa recompensa){
        appendChange(new ActualizarEventoRecompensa(recompensa)).apply();
    }

    public void actualizarContraEntornoTitulo(TituloPorAdquirir titulo){
        appendChange(new ActualizarContraEntornoTitulos(titulo)).apply();
    }

    public void actualizarContraJugadorTitulo(TituloPorAdquirir titulo){
        appendChange(new ActualizarContraJugadorTitulos(titulo)).apply();
    }

    public void actualizarEventoTitulo(TituloPorAdquirir titulo){
        appendChange(new ActualizarEventoTitulos(titulo)).apply();
    }

    public void actualizarContraEntornoSemana(Semanas semanas){
        appendChange(new ActualizarContraEntornoSemana(semanas)).apply();
    }

    public void actualizarJugadorSemana(Semanas semanas){
        appendChange(new ActualizarContraJugadorSemana(semanas)).apply();
    }

    public void actualizarEventoSemana(Semanas semanas){
        appendChange(new ActualizarEventoSemana(semanas)).apply();
    }


}
