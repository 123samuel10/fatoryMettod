package org.example.model;

public abstract class PetFactory {
    // Método abstracto que creará la mascota
    // Método abstracto que será implementado por las fábricas concretas (DogFactory, CatFactory)
    public abstract Pet createPet();
}