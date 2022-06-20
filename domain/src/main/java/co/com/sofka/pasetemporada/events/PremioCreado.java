package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.identities.PremioId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class PremioCreado extends DomainEvent {

    private final PremioId premioId;

    private final Nombre nombre;

    private final Duracion duracion;

    private final NivelNecesario nivel;

    private final Categoria categoria;


    public PremioCreado(PremioId premioId, Nombre nombre, Duracion duracion,
                        NivelNecesario nivel, Categoria categoria){
        super("co.com.sofka.pasetemporada.events.PremioCreado");
        this.premioId = premioId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.categoria = categoria;
    }

    public PremioId getPremioId() { return premioId; }

    public Nombre getNombre() { return nombre; }

    public Duracion getDuracion() { return duracion; }

    public NivelNecesario getNivelNecesario() { return nivel; }

    public Categoria getCategoria() { return categoria; }
}
