package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.pasetemporada.PaseTemporada;
import co.com.sofka.pasetemporada.command.CrearMisionPaseTemporadaCommand;

public class CrearMisionPaseTemporadaUseCase extends UseCase<RequestCommand<CrearMisionPaseTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearMisionPaseTemporadaCommand> input) {

        var command = input.getCommand();

        var mision  = new PaseTemporada(command.getPaseTemporadaId(),
                command.getMisionId(),
                command.getNombre(),
                command.getCategoria(),
                command.getDuracion(),
                command.getNivelNecesario());

        emit().onResponse(new ResponseEvents(mision.getUncommittedChanges()));

    }

}
