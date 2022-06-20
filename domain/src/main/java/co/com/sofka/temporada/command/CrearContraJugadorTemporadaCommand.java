package co.com.sofka.temporada.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.ContraJugadorId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class CrearContraJugadorTemporadaCommand extends Command {

    private final TemporadaId temporadaId;

    private final ContraJugadorId contraJugadorId;

    private final Nombre nombre;

    private final Fase fase;

    private final Semanas semanas;

    private final CantidadRecompensa cantidadRecompensa;

    private final TituloPorAdquirir tituloPorAdquirir;


    public CrearContraJugadorTemporadaCommand(TemporadaId temporadaId, ContraJugadorId contraJugadorId, Nombre nombre, Fase fase, Semanas semanas, CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir) {
        this.temporadaId = temporadaId;
        this.contraJugadorId = contraJugadorId;
        this.nombre = nombre;
        this.fase = fase;
        this.semanas = semanas;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
    }

    public TemporadaId getTemporadaId() { return temporadaId; }

    public ContraJugadorId getContraJugadorId() { return contraJugadorId; }

    public Nombre getNombre() { return nombre; }

    public Fase getFase() { return fase; }

    public Semanas getSemanas() { return semanas; }

    public CantidadRecompensa getCantidadRecompensa() { return cantidadRecompensa; }

    public TituloPorAdquirir getTituloPorAdquirir() { return tituloPorAdquirir; }
}
