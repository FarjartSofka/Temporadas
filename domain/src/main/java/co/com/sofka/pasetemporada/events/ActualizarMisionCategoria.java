package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Categoria;

public class ActualizarMisionCategoria extends DomainEvent {

    private Categoria categoria;

    public ActualizarMisionCategoria(Categoria categoria) {
        super("co.com.sofka.pasetemporada.events.ActualizarMisionCategoria");
        this.categoria = categoria;
    }

    public Categoria getCategoria() { return categoria; }
}
