package com.company;

public class Dog extends Animal {

    String breed;
    double snoutLength;
    int age;

    public Dog (int legs, String size, String name, double weight, boolean isFixed, String breed, double snoutLength, int age) {
        super (legs, size, name, weight, isFixed);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.age = age;
    }

    public String speak () {

        return "Urf";
    }

}
