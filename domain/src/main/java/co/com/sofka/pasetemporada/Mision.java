package co.com.sofka.pasetemporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.MisionId;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class Mision extends Entity<MisionId> {

    protected Nombre nombre;

    protected Duracion duracion;

    protected NivelNecesario nivel;

    protected Categoria categoria;

    public Mision(MisionId misionId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {
        super(misionId);
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public Mision(MisionId misionId){ super(misionId); }

     public static Mision from(MisionId misionId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {

        var mision = new Mision(misionId);

        mision.nombre = nombre;
        mision.duracion = duracion;
        mision.nivel = nivel;
        mision.categoria = categoria;

        return mision;
    }

    public String nombre() { return nombre.value(); }

    public Integer duracion() { return duracion.value(); }

    public Integer nivelNecesario() { return nivel.value(); }

    public Categoria.Types categoria() { return categoria.value(); }
}
