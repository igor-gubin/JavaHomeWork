package com.pb.gubin.hw3;

import java.util.Scanner;

public class Array<box> {
    public static void main(String[] args) {

    int[] box = new int[10]; // Определяем длину массива
    String[] boxes = new String[10];
        int counter = 0;
    Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < 10; i++) {
            box[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + box[i]); // Выводим на экран, полученный массив
            int sum = 0; // Подсчитать сумму всех элементов массива и вывести ее на экран
            for (i = 0; i < box.length; i++)
                sum = sum + box[i];

            System.out.println(sum);
            for (i = 0; i < box.length; i++){
                if (box[i] > 0)
                    sum = sum + box[i];
                counter++; // Считаем сумму положительных элементов массива и их количество
        }
            System.out.println("Сума положительных элементов массива = "+sum);
            System.out.println("Количество положительных элементов массива = " + counter);
        }
        System.out.println();
}
}