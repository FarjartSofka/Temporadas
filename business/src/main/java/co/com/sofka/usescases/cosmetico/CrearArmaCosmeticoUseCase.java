package co.com.sofka.usescases.cosmetico;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cosmetico.Cosmetico;
import co.com.sofka.cosmetico.command.CrearArmaCosmeticoCommand;
import co.com.sofka.cosmetico.command.CrearAspectoCosmeticoCommand;

public class CrearArmaCosmeticoUseCase extends UseCase<RequestCommand<CrearArmaCosmeticoCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearArmaCosmeticoCommand> input) {

        var command = input.getCommand();

        var aspecto  = new Cosmetico(command.getCosmeticoId(),
                command.getArmaId(),
                command.getNombre(),
                command.getGrupo(),
                command.getModelado(),
                command.getIlustracion(),
                command.getCalidad());

        // var aspecto = new Cosmetico(command.getCosmeticoId());

        //aspecto.agregarAspecto(command.getAspectoFactory());

        emit().onResponse(new ResponseEvents(aspecto.getUncommittedChanges()));

    }

}
