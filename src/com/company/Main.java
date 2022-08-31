package com.company;

public class Main {
    public static void main(String[] args) {

        Feline feline = new Feline();
        Feline[]felines={
                new Feline("Lion",4,true,true),
                new Feline("Jaguar",10,true,true)
        };
        feline.getArray(felines);

        Cat[]cats = {
                new Cat("Cat",4,true,true,"Murka"),
                new Cat("Cat",8,true,true,"Barsik")
        };

        feline.getArray(cats);

        Tiger[] tigers={
                new Tiger("Bengal Tiger",15,true,false),
                new Tiger("Ussury Tiger",21,false,true)
        };

        feline.getArray(tigers);

        Sheep sheep=new Sheep();
        Sheep []sheeps={
                new Sheep("Sheep",12,false,12),
                new Sheep("Sheep",13,false,10)
        };
        sheep.getArrays(sheeps);

        Shark shark=new Shark();
        Shark []sharks={
                new Shark("Shark",23,true),
                new Shark("Hammerhead shark",12,true)
        };
        shark.getArrayShark(sharks);
        shark.attack();
        shark.eating();
    }
}