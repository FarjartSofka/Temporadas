package co.com.sofka.temporada.identities;

import co.com.sofka.domain.generic.Identity;

public class ContraEntornoId extends Identity {

    private ContraEntornoId(String id){ super(id); }

    private ContraEntornoId() { super(); }

    public static ContraEntornoId of (String id) { return new ContraEntornoId(id); }
}
