package co.com.sofka.cosmetico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calidad implements ValueObject<Calidad.Types> {

    private final Types types;

    public Calidad(Types types) { this.types = Objects.requireNonNull(types, "Calidad Obligatorioa"); }

    @Override
    public Types value() { return types; }

    public enum Types {
        LEGENDARIA,
        EPICA,
        COMUN,
        REGULAR
    }
}
