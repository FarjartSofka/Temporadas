package co.com.sofka.pasetemporada;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.events.*;
import co.com.sofka.pasetemporada.identities.MisionId;
import co.com.sofka.pasetemporada.identities.PaseTemporadaId;
import co.com.sofka.pasetemporada.identities.PremioId;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;
import co.com.sofka.temporada.events.*;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;

public class PaseTemporada extends AggregateEvent<PaseTemporadaId> {

    protected Mision mision;

    protected Premio premio;

    protected Tematica tematica;


    public PaseTemporada(PaseTemporadaId entityId) {
        super(entityId);
    }

    public PaseTemporada(PaseTemporadaId paseTemporadaId, MisionId misionId, Nombre nombre, Categoria categoria, Duracion duracion, NivelNecesario nivelNecesario) {
        super(paseTemporadaId);
        subscribe(new PaseTemporadaChange(this));
        appendChange( new MisionCreada(misionId, nombre,  duracion, nivelNecesario, categoria)).apply();
    }

    public PaseTemporada(PaseTemporadaId paseTemporadaId, PremioId premioId, Nombre nombre, Categoria categoria, Duracion duracion, NivelNecesario nivelNecesario) {
        super(paseTemporadaId);
        subscribe(new PaseTemporadaChange(this));
        appendChange( new PremioCreado(premioId, nombre,  duracion, nivelNecesario, categoria)).apply();
    }

    public PaseTemporada(PaseTemporadaId paseTemporadaId, TematicaId tematicaId, Nombre nombre, Categoria categoria, Duracion duracion, NivelNecesario nivelNecesario) {
        super(paseTemporadaId);
        subscribe(new PaseTemporadaChange(this));
        appendChange( new TematicaCreada(tematicaId, nombre,  duracion, nivelNecesario, categoria)).apply();
    }

    public void actualizarMisionNombre(Nombre nombre){
        appendChange(new ActualizarMisionNombre(nombre)).apply();
    }

    public void actualizarPremioNombre(Nombre nombre){
        appendChange(new ActualizarPremioNombre(nombre)).apply();
    }

    public void actualizarTematicaNombre(Nombre nombre){
        appendChange(new ActualizarTematicaNombre(nombre)).apply();
    }

    public void actualizarMisionDuracion(Duracion duracion){
        appendChange(new ActualizarMisionDuracion(duracion)).apply();
    }

    public void actualizarPremioNombre(Duracion duracion){
        appendChange(new ActualizarPremioDuracion(duracion)).apply();
    }

    public void actualizarTematicaNombre(Duracion duracion){
        appendChange(new ActualizarTematicaDuracion(duracion)).apply();
    }

    public void actualizarMisionNivel(NivelNecesario nivelNecesario){
        appendChange(new ActualizarMisionNivel(nivelNecesario)).apply();
    }

    public void actualizarPremioNombre(NivelNecesario nivelNecesario){
        appendChange(new ActualizarPremioNivel(nivelNecesario)).apply();
    }

    public void actualizarTematicaNombre(NivelNecesario nivelNecesario){
        appendChange(new ActualizarTematicaNivel(nivelNecesario)).apply();
    }

    public void actualizarMisionCategoria(Categoria categoria){
        appendChange(new ActualizarMisionCategoria(categoria)).apply();
    }

    public void actualizarPremioCategoria(Categoria categoria){
        appendChange(new ActualizarPremioCategoria(categoria)).apply();
    }

    public void actualizarTematicaCategoria(Categoria categoria){
        appendChange(new ActualizarTematicaCategoria(categoria)).apply();
    }



}
