package co.com.sofka.temporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.ContraJugadorId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ContraJugador extends Entity<ContraJugadorId> {

    protected Nombre nombre;

    protected Semanas semana;

    protected CantidadRecompensa cantidadRecompensa;

    protected TituloPorAdquirir tituloPorAdquirir;

    protected Fase fase;

    public ContraJugador(ContraJugadorId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa,
                         TituloPorAdquirir tituloPorAdquirir, Fase fase) {
        super(entityId);
        this.nombre = nombre;
        this.semana = semana;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
        this.fase = fase;
    }

    public ContraJugador(ContraJugadorId entityId){ super(entityId); }

    public static ContraJugador from (ContraJugadorId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa,
                                      TituloPorAdquirir tituloPorAdquirir, Fase fase){

        var contraJugador = new ContraJugador(entityId);

        contraJugador.nombre = nombre;
        contraJugador.semana = semana;
        contraJugador.cantidadRecompensa = cantidadRecompensa;
        contraJugador.tituloPorAdquirir = tituloPorAdquirir;
        contraJugador.fase = fase;

        return contraJugador;
    }

    public String nombre() { return  nombre.value(); }

    public Integer semanas() { return  semana.value(); }

    public Integer cantidadRecompensa() { return  cantidadRecompensa.value(); }

    public String tituloPorAdquirir() { return  tituloPorAdquirir.value(); }

    public String fase() { return  fase.value(); }

    public void actualizarConNombre(Nombre nombre) { this.nombre = nombre; }

    public void actualizarSemanas(Semanas semana) { this.semana = semana; }

    public void actualizarCantidadRecompensa(CantidadRecompensa cantidadRecompensa) { this.cantidadRecompensa = cantidadRecompensa; }

    public void actualizarTituloAdquirir(TituloPorAdquirir tituloPorAdquirir) { this.tituloPorAdquirir = tituloPorAdquirir; }

    public void actualizarFase(Fase fase) { this.fase = fase; }

}
