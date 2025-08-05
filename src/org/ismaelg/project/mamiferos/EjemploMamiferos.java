package org.ismaelg.project.mamiferos;
import org.ismaelg.project.mamiferos.canino.Lobo;
import org.ismaelg.project.mamiferos.canino.Perro;
import org.ismaelg.project.mamiferos.felino.Guepardo;
import org.ismaelg.project.mamiferos.felino.Leon;
import org.ismaelg.project.mamiferos.felino.Tigre;
import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {


        Leon leonAfricano = new Leon("Sabana africana", 1.2f, 2.5f, 190.0f, "Panthera leo", 7.5f, 80, 15, 114.0f);
        Leon leonAsiatico = new Leon("Selva", 1.1f, 2.3f, 170.0f, "Panthera leo persica", 6.8f, 65, 8, 110.0f);

        Tigre tigreBengala = new Tigre("Selva tropical", 1.1f, 2.9f, 220.0f, "Panthera tigris tigris", 9.0f, 60, "Tigre de Bengala");
        Tigre tigreSiberiano = new Tigre("Bosques siberianos", 1.2f, 3.3f, 300.0f, "Panthera tigris altaica", 10.0f, 50, "Tigre siberiano");

        Guepardo guepardoAfricano = new Guepardo("Sabana africana", 0.9f, 1.5f, 72.0f, "Acinonyx jubatus", 4.5f, 112);
        Guepardo guepardoSoemmeringii = new Guepardo("Llanuras abiertas", 0.8f, 1.4f, 65.0f, "Acinonyx jubatus soemmeringii", 4.2f, 100);

        Lobo loboGris = new Lobo("Bosques templados", 0.8f, 1.6f, 45.0f, "Canis lupus", "Gris", 4.5f, 5, "Lobo gris");
        Lobo loboArtico = new Lobo("Tundra ártica", 0.9f, 1.8f, 55.0f, "Canis lupus arctos", "Blanco", 5.0f, 4, "Lobo ártico");

        Perro perroDomestico = new Perro("Entorno doméstico", 0.6f, 1.0f, 30.0f, "Canis lupus familiaris", "Marrón", 3.2f, 200);
        Perro perroGranjero = new Perro("Granjas rurales", 0.7f, 1.2f, 40.0f, "Canis lupus familiaris", "Negro", 3.5f, 250);

        // Guardar en una lista
        List<Mamiferos> mamiferos = new ArrayList<>();
        mamiferos.add(leonAfricano);
        mamiferos.add(leonAsiatico);
        mamiferos.add(tigreBengala);
        mamiferos.add(tigreSiberiano);
        mamiferos.add(guepardoAfricano);
        mamiferos.add(guepardoSoemmeringii);
        mamiferos.add(loboGris);
        mamiferos.add(loboArtico);
        mamiferos.add(perroDomestico);
        mamiferos.add(perroGranjero);

        System.out.println("=== Información general de los mamíferos ===");
        for (Mamiferos animal : mamiferos){
                System.out.println("animal = " + animal);

           }
        System.out.println("\n=== Comportamiento específico por animal ===");
        System.out.println(leonAfricano.comer());
        System.out.println(tigreSiberiano.dormir());
        System.out.println(guepardoSoemmeringii.correr());
        System.out.println(loboGris.comunicarse());
        System.out.println(perroGranjero.dormir());


    }
}
