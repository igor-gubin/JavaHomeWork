package com.pb.gubin.test;



public class test2 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        int[] massive = {-5, -4, -3, -2, -1, 0, 1, 1, 2, 3, 4, 5, 6, 7, 10};
        //Сума положительных элементов массива
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 0) {
                sum = sum + massive[i];
                counter++;
            }
        }
        System.out.println("Сума положительных элементов массива = " + sum);
        System.out.println("Количество положительных элементов массива = " + counter);
    }
}