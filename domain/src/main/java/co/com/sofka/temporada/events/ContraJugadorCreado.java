package co.com.sofka.temporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.ContraJugadorId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ContraJugadorCreado extends DomainEvent {

    private final ContraJugadorId contraJugadorId;

    private final Nombre nombre;

    private final Semanas semanas;

    private final CantidadRecompensa cantidadRecompensa;

    private final TituloPorAdquirir tituloPorAdquirir;

    private final Fase fase;

    public ContraJugadorCreado(ContraJugadorId contraJugadorId, Nombre nombre, Semanas semanas,
                               CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir,
                               Fase fase){
        super("co.com.sofka.temporada.events.ContraEntornoCreado");
        this.contraJugadorId = contraJugadorId;
        this.nombre = nombre;
        this.semanas = semanas;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
        this.fase = fase;
    }

    public ContraJugadorId getContraJugadorId() { return contraJugadorId; }

    public Nombre getNombre() { return nombre; }

    public Semanas getSemanas() { return semanas; }

    public CantidadRecompensa getCantidadRecompensa() { return cantidadRecompensa; }

    public TituloPorAdquirir getTituloPorAdquirir() { return tituloPorAdquirir; }

    public Fase getFase() { return fase; }

}
