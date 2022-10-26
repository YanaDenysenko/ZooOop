package org.example;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goat = new Goat();
        Animal lion = new Lion();
        Food grass = new Grass();

        cow.setName("cow");
        goat.setName("goat");
        lion.setName("lion");
        grass.setName("grass");

        lion.eat(goat);
        cow.eat(grass);
        lion.eat(lion);
    }
}