package co.com.sofka.cosmetico.events;

import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.MiscelaneoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class MiscelaneoCreado extends DomainEvent {

    private final MiscelaneoId miscelaneoId;

    private final Nombre nombre;

    private final Grupo grupo;

    private final Modelado modelado;

    private final Ilustracion ilustracion;

    private final Calidad calidad;


    public MiscelaneoCreado(MiscelaneoId miscelaneoId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad) {
        super("co.com.sofka.cosmetico.events.MiscelaneoCreado");
        this.miscelaneoId = miscelaneoId;
        this.nombre = nombre;
        this.grupo = grupo;
        this.modelado = modelado;
        this.ilustracion = ilustracion;
        this.calidad = calidad;
    }


    public MiscelaneoId getMiscelaneoId() {
        return miscelaneoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Modelado getModelado() {
        return modelado;
    }

    public Ilustracion getIlustracion() {
        return ilustracion;
    }

    public Calidad getCalidad() {
        return calidad;
    }
}
