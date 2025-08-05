package org.ismaelg.project.mamiferos.felino;

import org.ismaelg.project.mamiferos.Mamiferos;

abstract public class Felino extends Mamiferos {
    private float tamanoGarras;
    private Integer velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    @Override
    public String toString() {
        return super.toString() + "Felino{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                '}';
    }
}
