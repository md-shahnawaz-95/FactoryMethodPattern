package com.factory;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class BalancedAnimal extends AnimalFactory{
    Animal animal;

    @Override
    public Animal createAnimal(String type) {
        if (type.equals("Cat")){
            animal = new Cat();
        }else if (type.equals("Dog")){
            animal = new Dog();
        }else if (type.equals("Duck")){
            animal = new Duck();
        }else animal = null;
        return animal;
    }
    
}
