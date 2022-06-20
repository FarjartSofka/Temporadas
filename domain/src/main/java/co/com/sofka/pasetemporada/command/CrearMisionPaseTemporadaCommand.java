package co.com.sofka.pasetemporada.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.MisionId;
import co.com.sofka.pasetemporada.identities.PaseTemporadaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class CrearMisionPaseTemporadaCommand extends Command {

    private final PaseTemporadaId paseTemporadaId;

    private final MisionId misionId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivelNecesario;

    private final Categoria categoria;

    public CrearMisionPaseTemporadaCommand(PaseTemporadaId paseTemporadaId, MisionId misionId, Nombre nombre, Duracion duracion, NivelNecesario nivelNecesario, Categoria categoria) {
        this.paseTemporadaId = paseTemporadaId;
        this.misionId = misionId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelNecesario = nivelNecesario;
        this.categoria = categoria;
    }

    public PaseTemporadaId getPaseTemporadaId() { return paseTemporadaId; }

    public MisionId getMisionId() { return misionId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivelNecesario; }

    public Categoria getCategoria() { return categoria; }
}
