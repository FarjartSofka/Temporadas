package co.com.sofka.pasetemporada.factory;


import co.com.sofka.pasetemporada.Mision;
import co.com.sofka.pasetemporada.Premio;
import co.com.sofka.pasetemporada.Tematica;
import co.com.sofka.temporada.factory.TemporadaFactory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PaseTemporadaFactory {

    public static TemporadaFactory instance;

    private static final Set<Mision> misiones = new HashSet<>();

    public Set<Mision> misiones() { return misiones; }

    private static final Set<Premio> premios = new HashSet<>();

    public Set<Premio> premios() { return premios; }

    private static final Set<Tematica> tematicas = new HashSet<>();

    public Set<Tematica> tematicas() { return tematicas; }

    public static TemporadaFactory builder() { return new TemporadaFactory(); }

    public static TemporadaFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new TemporadaFactory();
            return instance;
        }
        return instance;
    }

}
