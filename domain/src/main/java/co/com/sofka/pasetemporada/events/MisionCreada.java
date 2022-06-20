package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.MisionId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class MisionCreada extends DomainEvent {

    private final MisionId misionId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivel;

    private final Categoria categoria;


    public MisionCreada(MisionId misionId, Nombre nombre, Duracion duracion,
                        NivelNecesario nivel, Categoria categoria){
        super("co.com.sofka.pasetemporada.events.MisionCreada");
        this.misionId = misionId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public MisionId getMisionId() { return misionId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivel; }

    public Categoria getCategoria() { return categoria; }
}
