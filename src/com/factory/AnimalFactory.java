package com.factory;

import com.product.Animal;

public abstract class AnimalFactory {
    public Animal spawnAnimals(String type){
        Animal animal = createAnimal(type);
        return animal;
    }
    public abstract Animal createAnimal(String type);
}
