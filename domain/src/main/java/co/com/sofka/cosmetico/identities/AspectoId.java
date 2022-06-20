package co.com.sofka.cosmetico.identities;

import co.com.sofka.domain.generic.Identity;

public class AspectoId extends Identity {

    private AspectoId(String id){ super(id); }

    private AspectoId() { super(); }

    public static AspectoId of (String id) { return new AspectoId(id); }

}
