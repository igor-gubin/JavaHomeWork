package com.pb.gubin.hw3;

import java.util.Scanner;

public class Array<box> {
    public static void main(String[] args) {
    int[] box = new int[10]; // Определяем длину массива
    String[] boxes = new String[10];
    Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < 10; i++) {
            box[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + box[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
}
}