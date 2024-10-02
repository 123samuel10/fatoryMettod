package org.example.model;

public class Dog extends Pet {
    // Implementación del método getType que retorna el tipo de mascota
    @Override
    public String getType() {
        return "Dog";
    }
    // Implementación del método makeSound que retorna el sonido que hace el perro
    @Override
    public String makeSound() {
        return "guau!";
    }
}