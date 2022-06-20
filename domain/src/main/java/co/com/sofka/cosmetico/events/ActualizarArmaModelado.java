package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.DomainEvent;

public class ActualizarArmaModelado extends DomainEvent {

    private Modelado modelado;

    public ActualizarArmaModelado(Modelado modelado) {
        super("co.com.sofka.cosmetico.events.ActualizarArmaModelado");
        this.modelado = modelado;
    }

    public Modelado getModelado() { return modelado; }
}
