package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.temporada.Temporada;
import co.com.sofka.temporada.command.CrearContraEntornoTemporadaCommand;
import co.com.sofka.temporada.factory.TemporadaFactory;

public class CrearContraEntornoTemporadaUseCase extends UseCase<RequestCommand<CrearContraEntornoTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearContraEntornoTemporadaCommand> input) {

        var command = input.getCommand();

        TemporadaFactory factory = TemporadaFactory.getInstance();

        var contraEntorno  = new Temporada(command.getTemporadaId(),
                command.getContraEntornoId(),
                command.getNombre(),
                command.getSemana(),
                command.getCantidadRecompensa(),
                command.getTituloPorAdquirir(),
                command.getFase());

        // contraEntorno.

        emit().onResponse(new ResponseEvents(contraEntorno.getUncommittedChanges()));

    }
}
