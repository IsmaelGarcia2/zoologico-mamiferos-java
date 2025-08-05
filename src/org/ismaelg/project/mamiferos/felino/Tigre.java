package org.ismaelg.project.mamiferos.felino;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + " acecha su presa en " + getHabitat() + " con sigilo y potencia.";
    }

    @Override
    public String dormir() {
        return "Descansa tranquilo en " + getHabitat() + ", protegiendo su territorio.";
    }

    @Override
    public String correr() {
        return "Corre a " + getVelocidad() + " km/h con garras de " + getTamanoGarras() + " cm, cazando en su hábitat.";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " ruge para comunicar su presencia en " + getHabitat() + ".";
    }
}
