package org.example;

import org.example.model.CatFactory;
import org.example.model.DogFactory;
import org.example.model.Pet;
import org.example.model.PetFactory;

public class Main {
    public static void main(String[] args) {
        // Crear una fábrica para crear perros
        PetFactory dogFactory = new DogFactory(); // Fábrica que crea perros
        Pet dog = dogFactory.createPet();  // Crea un perro usando la fábrica
        System.out.println("Pet: " + dog.getType()); // Imprime el tipo de mascota (perro)
        System.out.println("Sound: " + dog.makeSound()); // Imprime el sonido que hace el perro

        // Crear una fábrica para crear gatos
        PetFactory catFactory = new CatFactory(); // Fábrica que crea gatos
        Pet cat = catFactory.createPet();  // Crea un gato usando la fábrica
        System.out.println("Pet: " + cat.getType()); // Imprime el tipo de mascota (gato)
        System.out.println("Sound: " + cat.makeSound()); // Imprime el sonido que hace el gato
    }
}