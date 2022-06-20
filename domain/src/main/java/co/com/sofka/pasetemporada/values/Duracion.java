package co.com.sofka.pasetemporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<Integer> {

    private final Integer duracion;

    public Duracion(Integer duracion) { this.duracion = Objects.requireNonNull(duracion, "Duracion Obligatoria"); }

    @Override
    public Integer value() { return duracion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Duracion)) return false;
        Duracion duracion1 = (Duracion) o;
        return Objects.equals(duracion, duracion1.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duracion);
    }
}
