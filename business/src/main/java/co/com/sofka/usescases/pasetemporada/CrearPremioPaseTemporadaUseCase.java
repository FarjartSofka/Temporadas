package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.pasetemporada.PaseTemporada;
import co.com.sofka.pasetemporada.command.CrearPremioPaseTemporadaCommand;

public class CrearPremioPaseTemporadaUseCase extends UseCase<RequestCommand<CrearPremioPaseTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPremioPaseTemporadaCommand> input) {

        var command = input.getCommand();

        var premio  = new PaseTemporada(command.getPaseTemporadaId(),
                command.getPremioId(),
                command.getNombre(),
                command.getCategoria(),
                command.getDuracion(),
                command.getNivelNecesario());

        emit().onResponse(new ResponseEvents(premio.getUncommittedChanges()));

    }

}
