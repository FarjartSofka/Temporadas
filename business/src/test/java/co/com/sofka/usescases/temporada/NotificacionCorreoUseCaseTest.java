package co.com.sofka.usescases.temporada;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.service.SenderEmailService;
import co.com.sofka.temporada.command.CrearContraEntornoTemporadaCommand;
import co.com.sofka.temporada.events.ActualizarContraEntornoNombre;
import co.com.sofka.temporada.events.ContraEntornoCreado;
import co.com.sofka.temporada.identities.ContraEntornoId;
import co.com.sofka.temporada.identities.TemporadaId;
import co.com.sofka.temporada.values.CantidadRecompensa;
import co.com.sofka.temporada.values.Fase;
import co.com.sofka.temporada.values.Semanas;
import co.com.sofka.temporada.values.TituloPorAdquirir;
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
class NotificacionCorreoUseCaseTest {

    @Mock
    SenderEmailService senderEmailService;

    @InjectMocks
    NotificacionCorreoUseCase useCase;

    @Test
    void enviarCorreo(){

        var event = new ActualizarContraEntornoNombre(new Nombre("FUTURISTA"));

        doNothing().when(senderEmailService).envioMasivo(any(), any());
        useCase.addServiceBuilder(new ServiceBuilder().addService(senderEmailService));

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();


        Mockito.verify(senderEmailService).envioMasivo(any(), any());
        Assertions.assertEquals(0, events.size());
    }
}