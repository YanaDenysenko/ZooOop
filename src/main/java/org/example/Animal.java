package org.example;

abstract public class Animal<T extends Food> extends Food {

        public abstract void eat(T food);
}
