package co.com.sofka.cosmetico;

import co.com.sofka.cosmetico.events.ArmaCreada;
import co.com.sofka.cosmetico.events.AspectoCreado;
import co.com.sofka.cosmetico.events.MiscelaneoCreado;
import co.com.sofka.domain.generic.EventChange;

public class CosmeticoChange extends EventChange {

    public CosmeticoChange(Cosmetico cosmetico){

        apply((AspectoCreado event) -> {
            cosmetico.aspecto = new Aspecto(event.getAspectoId(),
                    event.getNombre(),
                    event.getGrupo(),
                    event.getModelado(),
                    event.getIlustracion(),
                    event.getCalidad());
        });

        apply((ArmaCreada event) -> {
            cosmetico.arma = new Arma(event.getArmaId(),
                    event.getNombre(),
                    event.getGrupo(),
                    event.getModelado(),
                    event.getIlustracion(),
                    event.getCalidad());
        });


        apply((MiscelaneoCreado event) -> {
            cosmetico.miscelaneo = new Miscelaneo(event.getMiscelaneoId(),
                    event.getNombre(),
                    event.getGrupo(),
                    event.getModelado(),
                    event.getIlustracion(),
                    event.getCalidad());
        });

    }

}
