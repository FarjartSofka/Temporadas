package co.com.sofka.pasetemporada.identities;

import co.com.sofka.domain.generic.Identity;


public class PremioId extends Identity {

    private PremioId(String id){ super(id); }

    private PremioId() { super(); }

    public static PremioId of (String id) { return new PremioId(id); }

}
