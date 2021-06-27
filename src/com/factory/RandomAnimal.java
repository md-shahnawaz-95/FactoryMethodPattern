package com.factory;

import com.product.Animal;
import com.product.Cat;
import com.product.Dog;
import com.product.Duck;

public class RandomAnimal extends AnimalFactory{

    @Override
    public Animal createAnimal(String type) {
        if (type.equals("Random")){
            int rand = (int)(Math.random() * 10);
            if (rand<3)
                return new Cat();
            else if(rand >= 3 && rand < 6)
                return new Dog();
            else
                return new Duck();
        }else return null;
    }
    
}
