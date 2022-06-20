package co.com.sofka.cosmetico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ilustracion implements ValueObject<String> {

    private final String ilustracion;

    public Ilustracion(String modelado) { this.ilustracion = Objects.requireNonNull(modelado, "Ilustracion Obligatorio"); }

    @Override
    public String value() { return ilustracion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ilustracion)) return false;
        Ilustracion ilustracion1 = (Ilustracion) o;
        return Objects.equals(ilustracion, ilustracion1.ilustracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ilustracion);
    }
}
