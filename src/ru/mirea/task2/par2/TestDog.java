package ru.mirea.task2.par2;

import java.util.ArrayList;

public class TestDog {
    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("bob", 3));
        dogs.add(new Dog("qwerty", 5));
        dogs.add(new Dog("Sam", 14));

        dogPrinter(dogs);
    }

    private static void dogPrinter(ArrayList<Dog> dogs) {
        for (Dog dog : dogs) System.out.println(dog);
    }
}
