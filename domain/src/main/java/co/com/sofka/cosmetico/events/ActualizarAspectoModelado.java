package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarAspectoModelado extends DomainEvent {

    private Modelado modelado;

    public ActualizarAspectoModelado(Modelado modelado) {
        super("co.com.sofka.cosmetico.events.ActualizarAspectoModelado");
        this.modelado = modelado;
    }

    public Modelado getModelado() { return modelado; }
}
