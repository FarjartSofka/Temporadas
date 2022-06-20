package co.com.sofka.cosmetico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Grupo implements ValueObject<String> {

    private final String grupo;

    public Grupo(String grupo) { this.grupo = Objects.requireNonNull(grupo, "Grupo Obligatorio"); }

    @Override
    public String value() { return grupo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        Grupo grupo1 = (Grupo) o;
        return Objects.equals(grupo, grupo1.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grupo);
    }
}
