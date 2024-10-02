package org.example.model;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();  // Crea una nueva instancia de Dog
    }
}