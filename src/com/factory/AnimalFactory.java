package com.factory;

import com.product.Animal;

public abstract class AnimalFactory {
    public Animal spawnAnimals(String type){
        return createAnimal(type);
    }
    public abstract Animal createAnimal(String type);
}
