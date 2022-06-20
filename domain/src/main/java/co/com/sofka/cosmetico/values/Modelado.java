package co.com.sofka.cosmetico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelado implements ValueObject<String> {

    private final String modelado;

    public Modelado(String modelado) { this.modelado = Objects.requireNonNull(modelado, "Modelado Obligatorio"); }

    @Override
    public String value() { return modelado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modelado)) return false;
        Modelado modelado1 = (Modelado) o;
        return Objects.equals(modelado, modelado1.modelado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelado);
    }
}
