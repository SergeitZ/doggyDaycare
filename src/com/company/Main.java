package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello user");

        ArrayList<Animal> animals = new ArrayList<>();

        DayCare.addAnimal(animals, new Dog(4, "Medium", "Buck", 96.5, true, "Husky", 5.5, 3));
        DayCare.addAnimal(animals, new Cat(4, "Small", "Jimmy", 12.3, true, "leopard", true));

        DayCare.displayAnimal(animals);
        DayCare.removeAnimal(animals, "Jimmy");
        DayCare.displayAnimal(animals);
    }
}