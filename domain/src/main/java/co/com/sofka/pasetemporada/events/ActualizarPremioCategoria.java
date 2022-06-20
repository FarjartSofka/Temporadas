package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.Categoria;

public class ActualizarPremioCategoria extends DomainEvent {

    private Categoria categoria;

    public ActualizarPremioCategoria(Categoria categoria) {
        super("co.com.sofka.pasetemporada.events.ActualizarPremioCategoria");
        this.categoria = categoria;
    }

    public Categoria getCategoria() { return categoria; }
}
