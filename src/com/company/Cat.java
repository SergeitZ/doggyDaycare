package com.company;

public class Cat extends Animal {

    String pattern;
    boolean wasStray;

    public Cat (int legs, String size, String name, double weight, boolean isFixed, String pattern, boolean wasStray) {
        super(legs, size, name, weight, isFixed);
        this.pattern = pattern;
        this.wasStray = wasStray;
    }

    public String speak() {
        return "Wow";
    }

}
