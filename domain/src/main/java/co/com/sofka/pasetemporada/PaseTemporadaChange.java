package co.com.sofka.pasetemporada;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.pasetemporada.events.MisionCreada;
import co.com.sofka.pasetemporada.events.PremioCreado;
import co.com.sofka.pasetemporada.events.TematicaCreada;

public class PaseTemporadaChange extends EventChange {

    public PaseTemporadaChange(PaseTemporada paseTemporada){

        apply((MisionCreada event)->{
            paseTemporada.mision = new Mision(event.getMisionId(),
                    event.getNombre(),
                    event.getDuracion(),
                    event.getNivelNecesario(),
                    event.getCategoria());
        });

        apply((PremioCreado event)->{
            paseTemporada.premio = new Premio(event.getPremioId(),
                    event.getNombre(),
                    event.getDuracion(),
                    event.getNivelNecesario(),
                    event.getCategoria());
        });

        apply((TematicaCreada event)->{
            paseTemporada.tematica = new Tematica(event.getTematicaId(),
                    event.getNombre(),
                    event.getDuracion(),
                    event.getNivelNecesario(),
                    event.getCategoria());
        });

    }

}
