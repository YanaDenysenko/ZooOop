package org.example;

abstract public class Animal extends Food{

    public void eat(Food food){
        if(this.getClass() == food.getClass()){
            System.out.println(this.getName() + " can't eat " + food.getName());
        }
        else {
            System.out.println(this.getName() + " eat " + food.getName());
        }
    }
}
