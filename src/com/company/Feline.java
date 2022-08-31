package com.company;

public class Feline extends Animal implements Eat {

    private boolean hasClaws;

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public Feline() {
    }



    public Feline(String name, int age, boolean hasTail, boolean hasClaws) {
        super(name, age, hasTail);
        this.hasClaws = hasClaws;
    }


    @Override
    public void eating() {
        System.out.println("Eating other animals");
    }

    public static interface Predator {
        void eating();

    }

    public void getArray(Feline[]felines){
        for (int i = 0; i < felines.length; i++) {
            System.out.println(felines[i]);
        }
    }

    @Override
    public String toString() {
        return " Name = " + super.getName()+","+
                "  Age = "+super.getAge()+","+
                " Tail = "+ super.isHasTail()+","+
                "  hasClaws = " + hasClaws+".";
    }
}
