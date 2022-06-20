package co.com.sofka.temporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Fase implements ValueObject<String> {

    private final String fase;

    public Fase(String fase) { this.fase = Objects.requireNonNull(fase, "Fase Obligatorio"); }

    @Override
    public String value() { return fase; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fase)) return false;
        Fase nombre1 = (Fase) o;
        return Objects.equals(fase, nombre1.fase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fase);
    }
}
