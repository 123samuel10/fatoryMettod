package org.example.model;

public class Cat extends Pet {
    // Implementación del método getType que retorna el tipo de mascota
    @Override
    public String getType() {
        return "Cat";// Retorna "Cat" como tipo de mascota
    }
    // Implementación del método makeSound que retorna el sonido que hace el gato
    @Override
    public String makeSound() {
        return "Miau!";
    }
}