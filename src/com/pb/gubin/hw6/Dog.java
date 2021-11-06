package com.pb.gubin.hw6;

public class Dog extends Animal {
    public String dog;
    public String breed;

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака ест");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Собака шумит");
    }
}
