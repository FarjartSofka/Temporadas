package co.com.sofka.pasetemporada.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pasetemporada.values.NivelNecesario;

public class ActualizarMisionNivel extends DomainEvent {

    private NivelNecesario nivelNecesario;

    public ActualizarMisionNivel(NivelNecesario nivelNecesario) {
        super("co.com.sofka.pasetemporada.events.ActualizarMisionNivel");
        this.nivelNecesario = nivelNecesario;
    }

    public NivelNecesario getNivel() { return nivelNecesario; }
}
