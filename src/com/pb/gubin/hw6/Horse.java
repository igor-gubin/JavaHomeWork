package com.pb.gubin.hw6;

public class Horse extends Animal{
    public String dog;
    public String suits;

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Лошадь шумит");
    }
}
