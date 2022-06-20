package co.com.sofka.cosmetico.factory;

import co.com.sofka.cosmetico.Aspecto;
import co.com.sofka.cosmetico.identities.AspectoId;
import co.com.sofka.cosmetico.values.Calidad;
import co.com.sofka.cosmetico.values.Grupo;
import co.com.sofka.cosmetico.values.Ilustracion;
import co.com.sofka.cosmetico.values.Modelado;
import co.com.sofka.generics.values.Nombre;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AspectoFactory {

    private final Set<Aspecto> aspectos;

    private static AspectoFactory instance;

    private AspectoFactory(){ aspectos = new HashSet<>(); }

    public static AspectoFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new AspectoFactory();
            return instance;
        }
        return instance;
    }

    public AspectoFactory agregarAspecto(AspectoId aspectoId, Nombre nombre, Grupo grupo, Modelado modelado, Ilustracion ilustracion, Calidad calidad){
        aspectos.add( new Aspecto(aspectoId, nombre, grupo, modelado, ilustracion, calidad));
        return this;
    }

     public Set<Aspecto> aspectos(){ return aspectos; }

}
