package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.pasetemporada.events.ActualizarMisionNombre;
import co.com.sofka.service.CreacionContenido;
import co.com.sofka.service.SenderEmailService;
import co.com.sofka.temporada.events.ActualizarContraEntornoNombre;

import java.util.ArrayList;
import java.util.List;

public class CreacionContenidoUseCase extends UseCase<TriggeredEvent<ActualizarMisionNombre>, ResponseEvents> {

        @Override
        public void executeUseCase(TriggeredEvent<ActualizarMisionNombre> input) {
            var event = input.getDomainEvent();
            var service = getService(CreacionContenido.class).orElseThrow();

            service.ContenidoCreado("Se Crea temporada Contra Entorno del Juego");

            emit().onResponse(new ResponseEvents(List.of()));
        }
}

