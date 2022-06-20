package co.com.sofka.temporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.EventoId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class Evento extends Entity<EventoId> {


    protected Nombre nombre;

    protected Semanas semana;

    protected CantidadRecompensa cantidadRecompensa;

    protected TituloPorAdquirir tituloPorAdquirir;

    protected Fase fase;

    public Evento(EventoId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa,
                  TituloPorAdquirir tituloPorAdquirir,  Fase fase) {
        super(entityId);
        this.nombre = nombre;
        this.semana = semana;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
        this.fase = fase;
    }

    public Evento(EventoId eventoId){ super(eventoId); }

    public static Evento from (EventoId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa,
                               TituloPorAdquirir tituloPorAdquirir,  Fase fase){

        var evento = new Evento(entityId);

        evento.nombre = nombre;
        evento.semana = semana;
        evento.cantidadRecompensa = cantidadRecompensa;
        evento.tituloPorAdquirir = tituloPorAdquirir;
        evento.fase = fase;

        return evento;
    }

    public String nombre() { return  nombre.value(); }

    public Integer semanas() { return  semana.value(); }

    public Integer cantidadRecompensa() { return  cantidadRecompensa.value(); }

    public String tituloPorAdquirir() { return  tituloPorAdquirir.value(); }

    public String fase() { return  fase.value(); }

    public void actualizarNombre(Nombre nombre) { this.nombre = nombre; }

    public void actualizarSemana(Semanas semana) { this.semana = semana; }

    public void actualizarCantidadRecompensa(CantidadRecompensa cantidadRecompensa) { this.cantidadRecompensa = cantidadRecompensa; }

    public void actualizarTituloAdquirir(TituloPorAdquirir tituloPorAdquirir) { this.tituloPorAdquirir = tituloPorAdquirir; }

    public void actualizarFase(Fase fase) { this.fase = fase; }

}
