package co.com.sofka.temporada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TituloPorAdquirir implements ValueObject<String> {

    private final String titulo;

    public TituloPorAdquirir(String titulo) { this.titulo = Objects.requireNonNull(titulo, "Titulo Obligatorio"); }

    @Override
    public String value() { return titulo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TituloPorAdquirir)) return false;
        TituloPorAdquirir nombre1 = (TituloPorAdquirir) o;
        return Objects.equals(titulo, nombre1.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
