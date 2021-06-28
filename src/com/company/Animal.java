package com.company;

public class Animal {

    int legs = 4;
    String size;
    boolean isFixed;
    public String name;
    double weight;

    public Animal (int legs, String size, String name, double weight, boolean isFixed) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.weight = weight;
        this.isFixed = isFixed;

    }

    public String speak() {
        return "---";
    }

}
