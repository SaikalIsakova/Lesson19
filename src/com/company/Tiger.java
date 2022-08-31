package com.company;

public class Tiger extends Feline{

    public Tiger() {
    }

    public Tiger(String name, int age, boolean hasTail, boolean hasClaws) {
        super(name, age, hasTail, hasClaws);
    }

    @Override
    public void eating() {
        super.eating();
    }

    @Override
    public String toString() {
        return super.toString();

    }
}