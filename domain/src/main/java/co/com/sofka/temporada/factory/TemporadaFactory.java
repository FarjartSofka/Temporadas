package co.com.sofka.temporada.factory;

import co.com.sofka.temporada.ContraEntorno;
import co.com.sofka.temporada.ContraJugador;
import co.com.sofka.temporada.Evento;
import co.com.sofka.temporada.Temporada;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TemporadaFactory {

    public static TemporadaFactory instance;

    private static final Set<ContraEntorno> contraEntornos = new HashSet<>();

    public Set<ContraEntorno> contraEntornos() { return contraEntornos; }

    private static final Set<ContraJugador> contraJugador = new HashSet<>();

    public Set<ContraJugador> contraJugador() { return contraJugador(); }

    private static final Set<Evento> evento = new HashSet<>();

    public Set<Evento> eventos() { return eventos(); }

    public static TemporadaFactory builder() { return new TemporadaFactory(); }

    public static TemporadaFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new TemporadaFactory();
            return instance;
        }
        return instance;
    }
}
