package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.service.SenderEmailService;
import co.com.sofka.temporada.events.ActualizarContraEntornoNombre;
import co.com.sofka.temporada.events.ContraEntornoCreado;

import java.util.ArrayList;
import java.util.List;

public class NotificacionCorreoUseCase extends UseCase<TriggeredEvent<ActualizarContraEntornoNombre>, ResponseEvents> {

        @Override
        public void executeUseCase(TriggeredEvent<ActualizarContraEntornoNombre> input) {
            var event = input.getDomainEvent();
            var service = getService(SenderEmailService.class).orElseThrow();

            var lista = new ArrayList<String>();
            lista.add("a");
            lista.add("b");
            lista.add("c");

            service.envioMasivo(lista , "Se Crea temporada Contra Entorno del Juego");

            emit().onResponse(new ResponseEvents(List.of()));
        }
}

