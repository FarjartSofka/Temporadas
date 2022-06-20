package co.com.sofka.cosmetico.command;

import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.CosmeticoId;
import co.com.sofka.cosmetico.identities.MiscelaneoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;


public class CrearMiscelaneoCosmeticoCommand extends Command {

    private final CosmeticoId cosmeticoId;

    private final MiscelaneoId miscelaneoId;

    private final Nombre nombre;

    private final Grupo grupo;

    private final Modelado modelado;

    private  final Ilustracion ilustracion;

    private final  Calidad calidad;

    public CrearMiscelaneoCosmeticoCommand(CosmeticoId cosmeticoId, MiscelaneoId miscelaneoId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad) {
        this.cosmeticoId = cosmeticoId;
        this.miscelaneoId = miscelaneoId;
        this.nombre = nombre;
        this.grupo = grupo;
        this.modelado = modelado;
        this.ilustracion = ilustracion;
        this.calidad = calidad;
    }

    public CosmeticoId getCosmeticoId() {
        return cosmeticoId;
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
