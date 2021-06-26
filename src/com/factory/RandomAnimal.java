package com.factory;

import java.util.ArrayList;
import java.util.List;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class RandomAnimal extends AnimalFactory{

    @Override
    public List<Animal> createAnimal() {
        List<Animal> animals = new ArrayList<Animal>();
        for (int i=1; i<=3; i++){
            int rand = (int)(Math.random() * 10);
            if (rand<3){
                animals.add(new Cat());
            }else if(rand >= 3 && rand < 6){
                animals.add(new Dog());
            }else{
                animals.add(new Duck());
            }
        }
        return animals;
    }
    
}
