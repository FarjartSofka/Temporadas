package co.com.sofka.temporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.identities.ContraEntornoId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class ContraEntorno extends Entity<ContraEntornoId> {

    protected Nombre nombre;

    protected Semanas semana;

    protected CantidadRecompensa cantidadRecompensa;

    protected TituloPorAdquirir tituloPorAdquirir;

    protected Fase fase;

    public ContraEntorno(ContraEntornoId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase) {
        super(entityId);
        this.nombre = nombre;
        this.semana = semana;
        this.cantidadRecompensa = cantidadRecompensa;
        this.tituloPorAdquirir = tituloPorAdquirir;
        this.fase = fase;
    }

    public ContraEntorno(ContraEntornoId contraEntornoId){ super(contraEntornoId); }


    public static ContraEntorno from (ContraEntornoId entityId, Nombre nombre, Semanas semana, CantidadRecompensa cantidadRecompensa, TituloPorAdquirir tituloPorAdquirir, Fase fase){

        var contraEntorno = new ContraEntorno(entityId);

        contraEntorno.nombre = nombre;
        contraEntorno.semana = semana;
        contraEntorno.cantidadRecompensa = cantidadRecompensa;
        contraEntorno.tituloPorAdquirir = tituloPorAdquirir;
        contraEntorno.fase = fase;

        return contraEntorno;
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
