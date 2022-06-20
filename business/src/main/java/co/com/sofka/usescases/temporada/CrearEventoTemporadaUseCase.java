package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.temporada.Temporada;
import co.com.sofka.temporada.command.CrearEventoTemporadaCommand;

public class CrearEventoTemporadaUseCase extends UseCase<RequestCommand<CrearEventoTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearEventoTemporadaCommand> input) {

        var command = input.getCommand();

        var evento  = new Temporada(command.getTemporadaId(),
                command.getEventoId(),
                command.getNombre(),
                command.getSemanas(),
                command.getCantidadRecompensa(),
                command.getTituloPorAdquirir(),
                command.getFase());

        emit().onResponse(new ResponseEvents(evento.getUncommittedChanges()));

    }
}
