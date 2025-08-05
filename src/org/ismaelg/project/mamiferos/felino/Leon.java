package org.ismaelg.project.mamiferos.felino;

public class Leon extends Felino{
    private Integer numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad, Integer numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león de " + getPeso() + " kg caza junto a su manada de " + numManada + " miembros en " + getHabitat() + ".";
    }

    @Override
    public String dormir() {
        return "Duerme bajo el sol de " + getHabitat() + " tras patrullar con su manada.";
    }

    @Override
    public String correr() {
        return "Corre a " + getVelocidad() + " km/h con sus garras de " + getTamanoGarras() + " cm para atrapar presas.";
    }

    @Override
    public String comunicarse() {
        return "Ruge con una potencia de " + potenciaRugidoDecibel + " dB para marcar su territorio en " + getHabitat() + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                '}';
    }
}
