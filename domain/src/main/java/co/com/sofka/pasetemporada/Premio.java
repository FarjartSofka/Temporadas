package co.com.sofka.pasetemporada;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.PremioId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class Premio extends Entity<PremioId> {

    protected Nombre nombre;

    protected Duracion duracion;

    protected NivelNecesario nivel;

    protected Categoria categoria;

    public Premio(PremioId premioId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {
        super(premioId);
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public Premio(PremioId premioId){ super(premioId); }

    public static Premio from(PremioId premioId, Nombre nombre, Duracion duracion, NivelNecesario nivel, Categoria categoria) {

        var premio = new Premio(premioId);

        premio.nombre = nombre;
        premio.duracion = duracion;
        premio.nivel = nivel;
        premio.categoria = categoria;

        return premio;
    }

    public String nombre() { return nombre.value(); }

    public Integer duracion() { return duracion.value(); }

    public Integer nivelNecesario() { return nivel.value(); }

    public Categoria.Types categoria() { return categoria.value(); }
}
