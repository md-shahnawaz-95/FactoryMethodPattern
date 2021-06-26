package com.factoryMethodPattern;

import java.util.List;

import com.factory.AnimalFactory;
import com.factory.BalancedAnimal;
import com.factory.RandomAnimal;
import com.product.Animal;

public class AnimalCreation {
    public static void main(String args[]){
        System.out.println("Welcome to Factory method pattern.\n");
        AnimalFactory balancedAnimal = new BalancedAnimal();
        AnimalFactory randomAnimal = new RandomAnimal();

        List<Animal> animal = balancedAnimal.spawnAnimals();
        System.out.println("This is a Balanced Factory\n\t" +
                          animal.get(0).getName()+", "
                          +animal.get(1).getName() + ", " 
                          +animal.get(2).getName() + " spawned!\n");
        
        animal = randomAnimal.spawnAnimals();
        System.out.println("This is a Random Factory\n\t" +
                          animal.get(0).getName()+", "
                          +animal.get(1).getName() + ", " 
                          +animal.get(2).getName() + " spawned!");
    }
}
