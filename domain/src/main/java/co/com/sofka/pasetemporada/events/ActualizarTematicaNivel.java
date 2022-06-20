package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class ActualizarTematicaNivel extends DomainEvent {

    private NivelNecesario nivelNecesario;

    public ActualizarTematicaNivel(NivelNecesario nivelNecesario) {
        super("co.com.sofka.pasetemporada.events.ActualizarTematicaNivel");
        this.nivelNecesario = nivelNecesario;
    }

    public NivelNecesario getNivel() { return nivelNecesario; }
}
