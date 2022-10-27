package org.example;

public class Main {
    public static void main(String[] args) {
        Animal<Plant> goat = new Goat();
        goat.setName("goat");

        Animal lion = new Lion();
        lion.setName("lion");

        Animal cow = new Cow();
        cow.setName("cow");

        Food grass = new Grass();
        grass.setName("grass");

        lion.eat(goat);
        cow.eat(grass);
        lion.eat(lion);
    }
}