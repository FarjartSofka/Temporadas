package co.com.sofka.temporada.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.ContraEntornoId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class CrearContraEntornoTemporadaCommand extends Command {

    private final TemporadaId temporadaId;

    private final ContraEntornoId contraEntornoId;

    private final Nombre nombre;

    private final Semanas semana;

    private final CantidadRecompensa cantidadRecompensa;

    private final TituloPorAdquirir tituloPorAdquirir;

    private final Fase fase;

   public CrearContraEntornoTemporadaCommand(TemporadaId temporadaId, ContraEntornoId contraEntornoId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase) {

        this.temporadaId = temporadaId;
        this.contraEntornoId = contraEntornoId;
        this.nombre = nombre;
        this.semana = semana;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
        this.fase = fase;
    }

    public TemporadaId getTemporadaId() {
        return temporadaId;
    }

    public ContraEntornoId getContraEntornoId() {
        return contraEntornoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Semanas getSemana() {
        return semana;
    }

    public CantidadRecompensa getCantidadRecompensa() {
        return cantidadRecompensa;
    }

    public TituloPorAdquirir getTituloPorAdquirir() {
        return tituloPorAdquirir;
    }

    public Fase getFase() {
        return fase;
    }
}
