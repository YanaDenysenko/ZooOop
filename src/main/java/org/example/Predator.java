package org.example;

public class Predator extends Animal<Animal>{

    @Override
    public void eat(Animal food){
        if(this.getClass() == food.getClass()){
            System.out.println(this.getName() + " can't eat " + food.getName());
        }
        else {
            System.out.println(this.getName() + " eat " + food.getName());
        }
    }
}
