package co.com.sofka.pasetemporada.identities;

import co.com.sofka.domain.generic.Identity;


public class TematicaId extends Identity {

    private TematicaId(String id){ super(id); }

    private TematicaId() { super(); }

    public static TematicaId of (String id) { return new TematicaId(id); }

}
