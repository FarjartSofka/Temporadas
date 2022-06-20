package co.com.sofka.usescases.cosmetico;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.cosmetico.events.ActualizarAspectoNombre;
import co.com.sofka.service.ActualizacionContenido;
import co.com.sofka.service.CreacionContenido;
import co.com.sofka.service.SenderEmailService;
import co.com.sofka.temporada.events.ActualizarContraEntornoNombre;

import java.util.ArrayList;
import java.util.List;

public class ActualizarContenidoUseCase extends UseCase<TriggeredEvent<ActualizarAspectoNombre>, ResponseEvents> {

        @Override
        public void executeUseCase(TriggeredEvent<ActualizarAspectoNombre> input) {
            var event = input.getDomainEvent();
            var service = getService(ActualizacionContenido.class).orElseThrow();

            service.ProcesoActualizacionRealizado("Nombre Aspecto Actualizado", "1");

            emit().onResponse(new ResponseEvents(List.of()));
        }
}

