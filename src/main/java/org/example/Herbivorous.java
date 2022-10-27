package org.example;

public class Herbivorous extends Animal<Plant>{

    @Override
    public void eat(Plant food){
        System.out.println(this.getName() + " eat " + food.getName());
    }
}
