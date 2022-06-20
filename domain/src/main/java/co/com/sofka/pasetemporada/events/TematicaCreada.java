package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class TematicaCreada extends DomainEvent {

    private final TematicaId tematicaId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivel;

    private final Categoria categoria;


    public TematicaCreada(TematicaId tematicaId, Nombre nombre, Duracion duracion,
                          NivelNecesario nivel, Categoria categoria){
        super("co.com.sofka.pasetemporada.events.TematicaCreada");
        this.tematicaId = tematicaId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public TematicaId getTematicaId() { return tematicaId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivel; }

    public Categoria getCategoria() { return categoria; }
}
