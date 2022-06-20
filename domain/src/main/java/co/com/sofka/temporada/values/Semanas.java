package co.com.sofka.temporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Semanas implements ValueObject<Integer> {

    private final Integer semanas;

    public Semanas(Integer semanas) { this.semanas = Objects.requireNonNull(semanas, "Semanas Obligatorio"); }

    @Override
    public Integer value() { return semanas; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Semanas)) return false;
        Semanas semanas1 = (Semanas) o;
        return Objects.equals(semanas, semanas1.semanas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semanas);
    }
}
