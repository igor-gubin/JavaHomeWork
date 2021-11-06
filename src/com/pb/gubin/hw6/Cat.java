package com.pb.gubin.hw6;

import java.util.Objects;

public class Cat extends Animal{

    public String name;
    public int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {


        Cat cat1 = new Cat("Рыжик", 10);
        Cat cat2 = new Cat("Барсик", 8);
        Cat cat3 = new Cat("Рыжик", 10);


        System.out.println("eq 1 3 :"+ cat3.equals(cat1));
        System.out.println("eq 1 2 :"+ cat1.equals(cat2));

        System.out.println("HashCode 1:" + cat1.hashCode());
        System.out.println("HashCode 1:" + cat2.hashCode());
        System.out.println("HashCode 1:" + cat3.hashCode());
        System.out.println(cat1);
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кот шумит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кот ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
