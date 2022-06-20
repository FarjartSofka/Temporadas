package co.com.sofka.pasetemporada.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.PaseTemporadaId;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class CrearTematicaPaseTemporadaCommand extends Command {

    private final PaseTemporadaId paseTemporadaId;

    private final TematicaId tematicaId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivelNecesario;

    private final Categoria categoria;

    public CrearTematicaPaseTemporadaCommand(PaseTemporadaId paseTemporadaId, TematicaId tematicaId, Nombre nombre, Duracion duracion, NivelNecesario nivelNecesario, Categoria categoria) {
        this.paseTemporadaId = paseTemporadaId;
        this.tematicaId = tematicaId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelNecesario = nivelNecesario;
        this.categoria = categoria;
    }

    public PaseTemporadaId getPaseTemporadaId() { return paseTemporadaId; }

    public TematicaId getTematicaId() { return tematicaId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivelNecesario; }

    public Categoria getCategoria() { return categoria; }
}
