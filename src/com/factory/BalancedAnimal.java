package com.factory;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class BalancedAnimal extends AnimalFactory{
    
    @Override
    public Animal createAnimal(String type) {
        if (type.equals("Cat")){
            return new Cat();
        }else if (type.equals("Dog")){
            return new Dog();
        }else if (type.equals("Duck")){
            return new Duck();
        }else return null;
    }
    
}
