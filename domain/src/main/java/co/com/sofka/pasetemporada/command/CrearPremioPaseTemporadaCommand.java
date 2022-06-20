package co.com.sofka.pasetemporada.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.PaseTemporadaId;
import co.com.sofka.pasetemporada.identities.PremioId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class CrearPremioPaseTemporadaCommand extends Command {

    private final PaseTemporadaId paseTemporadaId;

    private final PremioId premioId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivelNecesario;

    private final Categoria categoria;

    public CrearPremioPaseTemporadaCommand(PaseTemporadaId paseTemporadaId, PremioId premioId, Nombre nombre, Duracion duracion, NivelNecesario nivelNecesario, Categoria categoria) {
        this.paseTemporadaId = paseTemporadaId;
        this.premioId = premioId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelNecesario = nivelNecesario;
        this.categoria = categoria;
    }

    public PaseTemporadaId getPaseTemporadaId() { return paseTemporadaId; }

    public PremioId getPremioId() { return premioId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivelNecesario; }

    public Categoria getCategoria() { return categoria; }
}
