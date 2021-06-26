package com.factory;

import java.util.ArrayList;
import java.util.List;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class BalancedAnimal extends AnimalFactory{

    @Override
    public List<Animal> createAnimal() {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Duck());
        return animals;
    }
    
}
