package co.com.sofka.cosmetico.command;

import co.com.sofka.cosmetico.Aspecto;
import co.com.sofka.cosmetico.factory.AspectoFactory;
import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.CosmeticoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;


public class CrearAspectoCosmeticoCommand extends Command {

    private final CosmeticoId cosmeticoId;

    private final AspectoId aspectoId;

    private final Nombre nombre;

    private final Grupo grupo;

    private final Modelado modelado;

    private  final Ilustracion ilustracion;

    private final  Calidad calidad;

    public CrearAspectoCosmeticoCommand(CosmeticoId cosmeticoId, AspectoId aspectoId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad) {
        this.cosmeticoId = cosmeticoId;
        this.aspectoId = aspectoId;
        this.nombre = nombre;
        this.grupo = grupo;
        this.modelado = modelado;
        this.ilustracion = ilustracion;
        this.calidad = calidad;
    }

    public CosmeticoId getCosmeticoId() {
        return cosmeticoId;
    }

    public AspectoId getAspectoId() {
        return aspectoId;
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

    /*
    private final AspectoFactory aspectoFactory;

    private final CosmeticoId cosmeticoId;


    public CrearAspectoCosmeticoCommand(AspectoFactory aspectoFactory, CosmeticoId cosmeticoId) {
        this.aspectoFactory = aspectoFactory;
        this.cosmeticoId = cosmeticoId;
    }

    public AspectoFactory getAspectoFactory() { return aspectoFactory; }

    public CosmeticoId getCosmeticoId() { return cosmeticoId; }
*/

}
