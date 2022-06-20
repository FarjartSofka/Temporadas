package co.com.sofka.cosmetico.identities;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.pasetemporada.identities.MisionId;

public class CosmeticoId extends Identity {

    private CosmeticoId(String id){ super(id); }

    public CosmeticoId() { super(); }

    public static CosmeticoId of (String id) { return new CosmeticoId(id); }

}
