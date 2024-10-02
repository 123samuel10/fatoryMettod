package org.example.model;

public class CatFactory extends PetFactory {
    // Implementación del método createPet para devolver una instancia de Cat
    @Override
    public Pet createPet() {
        return new Cat();  // Crea una nueva instancia de Cat
    }
}