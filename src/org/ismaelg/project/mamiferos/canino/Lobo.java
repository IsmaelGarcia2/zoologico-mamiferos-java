package org.ismaelg.project.mamiferos.canino;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }


    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza en manada para alimentarse en su hábitat " + getHabitat() + ".";
    }

    @Override
    public String dormir() {
        return "El Lobo " + getColor() + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "Con sus patas poderosas y su cuerpo de " + getLargo() + " metros de largo, el lobo " + especieLobo + " corre ágilmente por los bosques de " + getHabitat() + ".";
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " aúlla para comunicarse con su manada en el vasto " + getHabitat() + ".";
    }
}
