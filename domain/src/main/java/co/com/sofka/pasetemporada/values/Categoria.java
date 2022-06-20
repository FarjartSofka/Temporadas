package co.com.sofka.pasetemporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<Categoria.Types> {

    private final Types types;

    public Categoria(Types types) { this.types = Objects.requireNonNull(types, "Categoria Obligatorioa"); }

    @Override
    public Types value() { return types; }

    public enum Types {
        PREMIUM,
        FREEMIUM,
        FREE
    }
}
