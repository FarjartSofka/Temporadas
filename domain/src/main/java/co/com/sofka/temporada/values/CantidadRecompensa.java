package co.com.sofka.temporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadRecompensa implements ValueObject<Integer> {

    private final Integer cantidadRecompensa;

    public CantidadRecompensa(Integer cantidadRecompensa) { this.cantidadRecompensa = Objects.requireNonNull(cantidadRecompensa, "CantidadRecompensas Obligatorio"); }

    @Override
    public Integer value() { return cantidadRecompensa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CantidadRecompensa)) return false;
        CantidadRecompensa cantidadRecompensa1 = (CantidadRecompensa) o;
        return Objects.equals(cantidadRecompensa, cantidadRecompensa1.cantidadRecompensa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidadRecompensa);
    }
}
