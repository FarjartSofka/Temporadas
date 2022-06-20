package co.com.sofka.usescases.cosmeticos;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.cosmetico.command.CrearArmaCosmeticoCommand;
import co.com.sofka.cosmetico.command.CrearAspectoCosmeticoCommand;
import co.com.sofka.cosmetico.events.ArmaCreada;
import co.com.sofka.cosmetico.events.AspectoCreado;
import co.com.sofka.cosmetico.identities.ArmaId;
import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.CosmeticoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.usescases.cosmetico.CrearArmaCosmeticoUseCase;
import co.com.sofka.usescases.cosmetico.CrearAspectoCosmeticoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearArmaUseCaseTest {

    @InjectMocks
    CrearArmaCosmeticoUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

    @Test
    void CrearMisionTest(){

/*
        //arrange
        AspectoFactory factory = AspectoFactory.getInstance().agregarAspecto(AspectoId.of("5A"), new Nombre("ASPECTO FUTURISTA"),
                        new Grupo("TECNOLOGICO"), new Modelado("5D"), new Ilustracion("Compartida"), new Calidad(Calidad.Types.LEGENDARIA));

        var id = new CosmeticoId();
        var command = new CrearAspectoCosmeticoCommand(factory, id);




        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        Assertions.assertEquals(1, events.size());
   */

        var id = ArmaId.of("520A");
        var armaId = CosmeticoId.of("5A");
        var nombre = new Nombre("ARMA INICIAL");
        var grupo = new Grupo("TECNOLOGICO") ;
        var modelado = new Modelado("5D");
        var ilustracion = new Ilustracion("Compartida");
        var calidad = new Calidad(Calidad.Types.LEGENDARIA);

        var command = new CrearArmaCosmeticoCommand(armaId, id, nombre, grupo, modelado, ilustracion, calidad);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var pve = (ArmaCreada) eventos.get(0);

        Assertions.assertEquals("Medioevo", pve.getNombre().value());
        Assertions.assertEquals("medieval", pve.getArmaId().value());


    }

}
