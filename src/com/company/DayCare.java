package com.company;

import java.util.List;

public class DayCare {


    public static void addAnimal(List<Animal> animals, Animal kind) {
        animals.add(kind);
    }

    public static void displayAnimal (List<Animal> animals) {
        for (Animal pet : animals) {
            System.out.println(pet.getClass().getSimpleName() + ":" + "\n" + pet);
        }
    }

    public static void removeAnimal (List<Animal> animals, String animalName) {
        for (Animal pet : animals) {
            if (pet.name.equals(animalName)) {
                animals.remove(pet);
                return;
            }
        }
    }
}
