package com.company;

public class Shark extends Animal implements Eat,Attack{

    public Shark() {
    }

    public Shark(String name, int age, boolean hasTail) {
        super(name, age, hasTail);
    }

    @Override
    public void attack() {
        System.out.println("The shark is a predator and it attacks");
    }

    @Override
    public void eating() {
        System.out.println("Eats all the fish and seals");
    }

    @Override
    public String toString() {
        return super.toString();

    }
        public void getArrayShark(Shark[]sharks){
            for (int i = 0; i < sharks.length; i++) {
                System.out.println(sharks[i]);
            }
        }
    }

