package co.com.sofka.pasetemporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class Tematica extends Entity<TematicaId> {

    protected Nombre nombre;

    protected Duracion duracion;

    protected NivelNecesario nivel;

    protected Categoria categoria;

    public Tematica(TematicaId tematicaId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {
        super(tematicaId);
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public Tematica(TematicaId tematicaId){ super(tematicaId); }

    public static Tematica from(TematicaId tematicaId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {

        var tematica = new Tematica(tematicaId);

        tematica.nombre = nombre;
        tematica.duracion = duracion;
        tematica.nivel = nivel;
        tematica.categoria = categoria;

        return tematica;
    }

    public String nombre() { return nombre.value(); }

    public Integer duracion() { return duracion.value(); }

    public Integer nivelNecesario() { return nivel.value(); }

    public Categoria.Types categoria() { return categoria.value(); }
}
