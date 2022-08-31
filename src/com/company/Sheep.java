package com.company;

public class Sheep extends Animal implements Eat {

    private double lengthOfWool;
    public Sheep() {
    }

    public Sheep(String name, int age, boolean hasTail,double lengthOfWool) {
        super(name, age, hasTail);
        this.lengthOfWool=lengthOfWool;
    }



    @Override
    public String toString() {
        return " Name = "+ super.getName()+
                ", Age = "+ super.getAge()+
                ", Has tail = " + super.isHasTail()+
                ", Length of wool = "+ lengthOfWool;
    }

    @Override
    public void eating() {
        System.out.println("Eating grass");
    }
    public void getArrays(Sheep[]sheep){
        for (int i = 0; i < sheep.length; i++) {
            System.out.println(sheep[i]);
        }
    }
}
