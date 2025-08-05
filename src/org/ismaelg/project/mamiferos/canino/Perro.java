package org.ismaelg.project.mamiferos.canino;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro muestra su energía al devorar su comida con una mordida de " + fuerzaMordida + " PSI, especialmente después de un largo día en " + getHabitat() + ".";
    }

    @Override
    public String dormir() {
        return "Acurrucado en su rincón favorito de " + getHabitat() + ", el perro de pelaje " + getColor() + " duerme profundamente, soñando con correr y jugar.";
    }

    @Override
    public String correr() {
        return "Con su cuerpo ágil de " + getLargo() + " metros y colmillos de " + getTamanoColmillos() + " cm, el perro recorre velozmente el terreno de " + getHabitat() + " en busca de aventura.";
    }

    @Override
    public String comunicarse() {
        return "El perro ladra con entusiasmo para alertar, jugar o simplemente saludar en su entorno de " + getHabitat() + ".";
    }
}
