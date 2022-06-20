package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.temporada.Temporada;
import co.com.sofka.temporada.command.CrearContraEntornoTemporadaCommand;
import co.com.sofka.temporada.command.CrearContraJugadorTemporadaCommand;

public class CrearContraJugadorTemporadaUseCase extends UseCase<RequestCommand<CrearContraJugadorTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearContraJugadorTemporadaCommand> input) {

        var command = input.getCommand();

        var contraJugador  = new Temporada(command.getTemporadaId(),
                command.getContraJugadorId(),
                command.getNombre(),
                command.getSemanas(),
                command.getCantidadRecompensa(),
                command.getTituloPorAdquirir(),
                command.getFase());

        emit().onResponse(new ResponseEvents(contraJugador.getUncommittedChanges()));

    }
}
