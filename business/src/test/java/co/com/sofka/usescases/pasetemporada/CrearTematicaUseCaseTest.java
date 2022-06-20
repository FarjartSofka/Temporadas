package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.command.CrearTematicaPaseTemporadaCommand;
import co.com.sofka.pasetemporada.events.TematicaCreada;
import co.com.sofka.pasetemporada.identities.PaseTemporadaId;
import co.com.sofka.pasetemporada.identities.TematicaId;
import co.com.sofka.pasetemporada.values.Categoria;
import co.com.sofka.pasetemporada.values.Duracion;
import co.com.sofka.pasetemporada.values.NivelNecesario;
import co.com.sofka.usescases.pasetemporada.CrearTematicaPaseTemporadaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearTematicaUseCaseTest {

    @InjectMocks
    CrearTematicaPaseTemporadaUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

    @Test
    void CrearTematicaTest(){
        var id = TematicaId.of("medieval");
        var temporadaId = PaseTemporadaId.of("Clasica");
        var nombre = new Nombre("Medioevo");
        var duracion = new Duracion(5) ;
        var nivel = new NivelNecesario(30);
        var categoria = new Categoria(Categoria.Types.FREE);

        var command = new CrearTematicaPaseTemporadaCommand(temporadaId, id, nombre, duracion, nivel, categoria);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var pve = (TematicaCreada) eventos.get(0);

        Assertions.assertEquals("Medioevo", pve.getNombre().value());
        Assertions.assertEquals("medieval", pve.getTematicaId().value());
    }
}
