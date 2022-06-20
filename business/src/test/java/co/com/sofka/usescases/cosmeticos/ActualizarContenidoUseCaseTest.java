package co.com.sofka.usescases.cosmeticos;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.cosmetico.events.ActualizarAspectoNombre;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.service.ActualizacionContenido;
import co.com.sofka.service.SenderEmailService;
import co.com.sofka.temporada.events.ActualizarContraEntornoNombre;
import co.com.sofka.usescases.cosmetico.ActualizarContenidoUseCase;
import co.com.sofka.usescases.temporada.NotificacionCorreoUseCase;
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
class ActualizarContenidoUseCaseTest {

    @Mock
    ActualizacionContenido service;

    @InjectMocks
    ActualizarContenidoUseCase useCase;

    @Test
    void actualizarContenido(){

        var event = new ActualizarAspectoNombre(new Nombre("FUTURISTA"));

        doNothing().when(service).ProcesoActualizacionRealizado(any(), any());
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();


        Mockito.verify(service).ProcesoActualizacionRealizado(any(), any());
        Assertions.assertEquals(0, events.size());
    }
}