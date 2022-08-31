package com.company;

public class Cat extends Tiger{
    private String nickName;

    @Override
    public String toString() {
        return " Name = " + super.getName()+
                ",  Age = "+super.getAge()+
                ", Tail = "+ super.isHasTail()+
                ", Claws = " + super.isHasClaws()+
                ", Nick name = " + getNickName();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Cat(String name, int age, boolean hasTail, boolean hasClaws, String nickName) {
        super(name, age, hasTail, hasClaws);
        this.nickName = nickName;
    }
}
