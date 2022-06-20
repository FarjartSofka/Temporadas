package co.com.sofka.temporada.identities;

import co.com.sofka.domain.generic.Identity;

public class TemporadaId extends Identity {

    private TemporadaId(String id){ super(id); }

    private TemporadaId() { super(); }

    public static TemporadaId of (String id) { return new TemporadaId(id); }

}
