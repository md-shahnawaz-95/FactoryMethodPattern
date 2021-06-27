package com.factory;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class RandomAnimal extends AnimalFactory{

    Animal animal;

    @Override
    public Animal createAnimal(String type) {
        if (type.equals("Random")){
            for (int i=1; i<=3; i++){
                int rand = (int)(Math.random() * 10);
                if (rand<3){
                    animal = new Cat();
                }else if(rand >= 3 && rand < 6){
                    animal = new Dog();
                }else{
                    animal = new Duck();
                }
            }
        }else animal=null;
        return animal;
    }
    
}
