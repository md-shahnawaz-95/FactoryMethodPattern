package com.factoryMethodPattern;

import com.factory.AnimalFactory;
import com.factory.BalancedAnimal;
import com.factory.RandomAnimal;
import com.product.Animal;

public class AnimalCreation {
    public static void main(String args[]){
        System.out.println("Welcome to Factory method pattern.\n");
        AnimalFactory balancedAnimal = new BalancedAnimal();
        AnimalFactory randomAnimal = new RandomAnimal();

        Animal animal = balancedAnimal.spawnAnimals("Dog");
        if(animal != null)
            System.out.println("This is a Balanced Factory\n\t" + animal.getName() + " spawned!");
        else
            System.out.println("This is a Balanced Factory\n\tPlease provide correct type(Cat, Dog, Duck, Random).");
        
        animal = randomAnimal.spawnAnimals("Random");
        if(animal != null)
            System.out.println("This is a Random Factory\n\t" + animal.getName() + " spawned!");
        else
            System.out.println("This is a Random Factory\n\tPlease provide correct type(Cat, Dog, Duck, Random).");
    }
}
