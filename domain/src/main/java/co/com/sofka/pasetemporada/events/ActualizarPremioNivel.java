package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class ActualizarPremioNivel extends DomainEvent {

    private NivelNecesario nivelNecesario;

    public ActualizarPremioNivel(NivelNecesario nivelNecesario) {
        super("co.com.sofka.pasetemporada.events.ActualizarPremioNivel");
        this.nivelNecesario = nivelNecesario;
    }

    public NivelNecesario getNivelNecesario() { return nivelNecesario; }
}
