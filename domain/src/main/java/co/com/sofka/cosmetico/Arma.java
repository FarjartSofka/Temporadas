package co.com.sofka.cosmetico;

import co.com.sofka.cosmetico.identities.ArmaId;
import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;

public class Arma extends Entity<ArmaId> {

    protected Nombre nombre;

    protected Grupo grupo;

    protected Modelado modelado;

    protected Ilustracion ilustracion;

    protected Calidad calidad;

    public Arma(ArmaId entityId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad) {
        super(entityId);
        this.nombre = nombre;
        this.grupo = grupo;
        this.modelado = modelado;
        this.ilustracion = ilustracion;
        this.calidad = calidad;
    }

    public Arma(ArmaId armaId){ super(armaId); }

    public static Arma from (ArmaId entityId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad){

        var arma = new Arma(entityId);

        arma.nombre = nombre;
        arma.grupo = grupo;
        arma.modelado = modelado;
        arma.ilustracion = ilustracion;
        arma.calidad = calidad;

        return arma;
    }

    public String nombre() { return nombre.value(); }

    public String grupo() { return grupo.value(); }

    public String modelado() { return modelado.value(); }

    public String ilustracion() { return ilustracion.value(); }

    public Calidad.Types calidad() { return calidad.value(); }

}
