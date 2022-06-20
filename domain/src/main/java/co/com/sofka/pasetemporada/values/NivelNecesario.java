package co.com.sofka.pasetemporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NivelNecesario implements ValueObject<Integer> {

    private final Integer nivelNecesario;

    public NivelNecesario(Integer nivelNecesario) { this.nivelNecesario = Objects.requireNonNull(nivelNecesario, "Nivel Necesario Obligatorio"); }

    @Override
    public Integer value() { return nivelNecesario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NivelNecesario)) return false;
        NivelNecesario nivelNecesario1 = (NivelNecesario) o;
        return Objects.equals(nivelNecesario, nivelNecesario1.nivelNecesario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivelNecesario);
    }
}
