package co.com.sofka.temporada.identities;

import co.com.sofka.domain.generic.Identity;

public class EventoId extends Identity {

    private EventoId(String id){ super(id); }

    private EventoId() { super(); }

    public static EventoId of (String id) { return new EventoId(id); }

}
