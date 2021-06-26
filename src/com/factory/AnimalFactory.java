package com.factory;

import java.util.List;

import com.product.Animal;

public abstract class AnimalFactory {
    public List<Animal> spawnAnimals(){
        return createAnimal();
    }
    public abstract List<Animal> createAnimal();
}
