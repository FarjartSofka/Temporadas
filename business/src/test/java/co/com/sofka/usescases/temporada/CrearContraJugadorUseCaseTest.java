package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.command.CrearContraJugadorTemporadaCommand;
import co.com.sofka.temporada.events.ContraJugadorCreado;
import co.com.sofka.temporada.identities.ContraJugadorId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;
import co.com.sofka.usescases.temporada.CrearContraJugadorTemporadaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearContraJugadorUseCaseTest {

    @InjectMocks
    CrearContraJugadorTemporadaUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

    @Test
    void CrearContraJugadorTest(){
        var id = ContraJugadorId.of("terrateniente");
        var temporadaId = TemporadaId.of("Clasica");
        var nombre = new Nombre("Clasica");
        var semana = new Semanas(5) ;
        var recompensas = new CantidadRecompensa(4);
        var titulo = new TituloPorAdquirir("Feudal");
        var fase = new Fase("Equivalente");

        var command = new CrearContraJugadorTemporadaCommand(temporadaId, id, nombre, fase, semana, recompensas, titulo);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var pve = (ContraJugadorCreado) eventos.get(0);

        Assertions.assertEquals("Clasica", pve.getNombre().value());
        Assertions.assertEquals("terrateniente", pve.getContraJugadorId().value());
    }
}
