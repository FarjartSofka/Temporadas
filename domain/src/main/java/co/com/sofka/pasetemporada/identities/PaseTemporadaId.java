package co.com.sofka.pasetemporada.identities;

import co.com.sofka.domain.generic.Identity;

public class PaseTemporadaId extends Identity {

    private PaseTemporadaId(String id){ super(id); }

    private PaseTemporadaId() { super(); }

    public static PaseTemporadaId of (String id) { return new PaseTemporadaId(id); }

}
