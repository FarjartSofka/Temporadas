package co.com.sofka.pasetemporada.identities;

import co.com.sofka.domain.generic.Identity;


public class MisionId extends Identity {

    private MisionId(String id){ super(id); }

    private MisionId() { super(); }

    public static MisionId of (String id) { return new MisionId(id); }

}
