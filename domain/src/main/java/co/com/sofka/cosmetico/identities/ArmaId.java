package co.com.sofka.cosmetico.identities;

import co.com.sofka.domain.generic.Identity;

public class ArmaId extends Identity {

    private ArmaId(String id){ super(id); }

    private ArmaId() { super(); }

    public static ArmaId of (String id) { return new ArmaId(id); }

}
