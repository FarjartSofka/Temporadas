package co.com.sofka.temporada.identities;

import co.com.sofka.domain.generic.Identity;

public class ContraJugadorId extends Identity {

    private ContraJugadorId(String id){ super(id); }

    private ContraJugadorId() { super(); }

    public static ContraJugadorId of (String id) { return new ContraJugadorId(id); }

}
