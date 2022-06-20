package co.com.sofka.cosmetico.identities;

import co.com.sofka.domain.generic.Identity;

public class MiscelaneoId extends Identity {

    private MiscelaneoId(String id){ super(id); }

    private MiscelaneoId() { super(); }

    public static MiscelaneoId of (String id) { return new MiscelaneoId(id); }

}
