package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarMiscelaneoModelado extends DomainEvent {

    private Modelado modelado;

    public ActualizarMiscelaneoModelado(Modelado modelado) {
        super("co.com.sofka.cosmetico.events.ActualizarMiscelaneoModelado");
        this.modelado = modelado;
    }

    public Modelado getModelado() { return modelado; }
}
