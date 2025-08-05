package org.ismaelg.project.mamiferos.felino;

public class Guepardo extends Felino{

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo de " + getPeso() + " kg devora su presa en las llanuras de " + getHabitat() + ".";
    }


    @Override
    public String dormir() {
        return "Descansa bajo la sombra en " + getHabitat() + " tras correr a " + getVelocidad() + " km/h.";
    }

    @Override
    public String correr() {
        return "Corre a " + getVelocidad() + " km/h con sus garras de " + getTamanoGarras() + " cm clavándose en la tierra.";
    }

    @Override
    public String comunicarse() {
        return "Emite chillidos agudos en " + getHabitat() + " para localizar a su cría.";
    }

}
