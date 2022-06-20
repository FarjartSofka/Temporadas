package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Categoria;

public class ActualizarTematicaCategoria extends DomainEvent {

    private Categoria categoria;

    public ActualizarTematicaCategoria(Categoria categoria) {
        super("co.com.sofka.pasetemporada.events.ActualizarTematicaCategoria");
        this.categoria = categoria;
    }

    public Categoria getCategoria() { return categoria; }
}
