package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.temporada.command.CrearContraEntornoTemporadaCommand;
import co.com.sofka.temporada.events.ContraEntornoCreado;
import co.com.sofka.temporada.identities.ContraEntornoId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;
import co.com.sofka.usescases.temporada.CrearContraEntornoTemporadaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearContraEntornoUseCaseTest {

    @InjectMocks
    CrearContraEntornoTemporadaUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

    @Test
    void CrearContraEntornoTest(){
        var id = ContraEntornoId.of("medieval");
        var temporadaId = TemporadaId.of("Clasica");
        var nombre = new Nombre("Medioevo");
        var semana = new Semanas(5) ;
        var recompensas = new CantidadRecompensa(4);
        var titulo = new TituloPorAdquirir("Inquisidor");
        var fase = new Fase("Equivalente");

        var command = new CrearContraEntornoTemporadaCommand(temporadaId, id, nombre, semana, recompensas, titulo, fase);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var pve = (ContraEntornoCreado) eventos.get(0);

        Assertions.assertEquals("Medioevo", pve.getNombre().value());
        Assertions.assertEquals("medieval", pve.getContraEntornoId().value());
    }
}
