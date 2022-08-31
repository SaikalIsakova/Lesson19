package com.company;

public abstract class Animal {
    private String name;
    private int age;
    boolean hasTail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Animal() {
    }

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return
                " Name = " + name + '\'' +
                ", Age=" + age +
                ", HasTail=" + hasTail;
    }
}
