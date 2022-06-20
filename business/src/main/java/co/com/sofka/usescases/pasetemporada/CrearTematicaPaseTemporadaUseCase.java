package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.pasetemporada.PaseTemporada;
import co.com.sofka.pasetemporada.command.CrearTematicaPaseTemporadaCommand;

public class CrearTematicaPaseTemporadaUseCase extends UseCase<RequestCommand<CrearTematicaPaseTemporadaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTematicaPaseTemporadaCommand> input) {

        var command = input.getCommand();

        var mision  = new PaseTemporada(command.getPaseTemporadaId(),
                command.getTematicaId(),
                command.getNombre(),
                command.getCategoria(),
                command.getDuracion(),
                command.getNivelNecesario());

        emit().onResponse(new ResponseEvents(mision.getUncommittedChanges()));

    }

}
