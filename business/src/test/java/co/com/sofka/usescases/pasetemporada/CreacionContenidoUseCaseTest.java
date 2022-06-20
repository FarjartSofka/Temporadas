package co.com.sofka.usescases.pasetemporada;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.cosmetico.events.ActualizarAspectoNombre;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.pasetemporada.events.ActualizarMisionNombre;
import co.com.sofka.service.ActualizacionContenido;
import co.com.sofka.service.CreacionContenido;
import co.com.sofka.usescases.cosmetico.ActualizarContenidoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
class CreacionContenidoUseCaseTest {

    @Mock
    CreacionContenido service;

    @InjectMocks
    CreacionContenidoUseCase useCase;

    @Test
    void crearContenido(){

        var event = new ActualizarMisionNombre(new Nombre("FUTURISTA"));

        doNothing().when(service).ContenidoCreado(any());
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();


        Mockito.verify(service).ContenidoCreado(any());
        Assertions.assertEquals(0, events.size());
    }
}