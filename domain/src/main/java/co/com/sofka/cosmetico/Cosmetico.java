package co.com.sofka.cosmetico;

import co.com.sofka.cosmetico.events.ArmaCreada;
import co.com.sofka.cosmetico.events.AspectoCreado;
import co.com.sofka.cosmetico.events.MiscelaneoCreado;
import co.com.sofka.cosmetico.factory.AspectoFactory;
import co.com.sofka.cosmetico.identities.ArmaId;
import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.identities.CosmeticoId;
import co.com.sofka.cosmetico.identities.MiscelaneoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.generics.values.Nombre;

public class Cosmetico extends AggregateEvent<CosmeticoId> {


    protected Arma arma;

    protected  Miscelaneo miscelaneo;

    protected Aspecto aspecto;

    public Cosmetico(CosmeticoId cosmeticoId, AspectoId aspectoId, Nombre nombre, Grupo grupo, Modelado modelado,
                     Ilustracion ilustracion, Calidad calidad) {
        super(cosmeticoId);
        subscribe( new CosmeticoChange(this));
        appendChange( new AspectoCreado(aspectoId, nombre, grupo, modelado, ilustracion, calidad));
    }

    public Cosmetico(CosmeticoId cosmeticoId, ArmaId armaId, Nombre nombre, Grupo grupo, Modelado modelado,
                     Ilustracion ilustracion, Calidad calidad) {
        super(cosmeticoId);
        subscribe( new CosmeticoChange(this));
        appendChange( new ArmaCreada(armaId, nombre, grupo, modelado, ilustracion, calidad));
    }

    public Cosmetico(CosmeticoId cosmeticoId, MiscelaneoId miscelaneoId, Nombre nombre, Grupo grupo, Modelado modelado,
                     Ilustracion ilustracion, Calidad calidad) {
        super(cosmeticoId);
        subscribe( new CosmeticoChange(this));
        appendChange( new MiscelaneoCreado(miscelaneoId, nombre, grupo, modelado, ilustracion, calidad));
    }

    public Cosmetico(CosmeticoId entityId) {
        super(entityId);
        subscribe( new CosmeticoChange(this));
    }

    public void agregarAspecto(AspectoFactory aspectoFactory){
        aspectoFactory.aspectos().forEach(aspecto -> appendChange(
                new AspectoCreado(aspecto.identity(), aspecto.nombre, aspecto.grupo, aspecto.modelado
                , aspecto.ilustracion, aspecto.calidad)).apply());
    }

}
