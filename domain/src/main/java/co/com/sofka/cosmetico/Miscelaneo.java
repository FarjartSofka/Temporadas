package co.com.sofka.cosmetico;

import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.MiscelaneoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;

public class Miscelaneo extends Entity<MiscelaneoId> {

    protected Nombre nombre;

    protected Grupo grupo;

    protected Modelado modelado;

    protected Ilustracion ilustracion;

    protected Calidad calidad;

    public Miscelaneo(MiscelaneoId entityId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad) {
        super(entityId);
        this.nombre = nombre;
        this.grupo = grupo;
        this.modelado = modelado;
        this.ilustracion = ilustracion;
        this.calidad = calidad;
    }

    public Miscelaneo(MiscelaneoId miscelaneoId){ super(miscelaneoId); }

    public static Miscelaneo from (MiscelaneoId entityId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad){

        var aspecto = new Miscelaneo(entityId);

        aspecto.nombre = nombre;
        aspecto.grupo = grupo;
        aspecto.modelado = modelado;
        aspecto.ilustracion = ilustracion;
        aspecto.calidad = calidad;

        return aspecto;
    }

    public String nombre() { return nombre.value(); }

    public String grupo() { return grupo.value(); }

    public String modelado() { return modelado.value(); }

    public String ilustracion() { return ilustracion.value(); }

    public Calidad.Types calidad() { return calidad.value(); }
}
