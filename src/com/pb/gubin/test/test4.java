package com.pb.gubin.test;
import java.util.Arrays;
import java.util.Scanner;

public class test4<box> {
    public static void main(String[] args) {

        int[] box = new int[10]; // Определяем длину массива
        String[] boxes = new String[10];
        int sum = 0; // Подсчитать сумму всех элементов массива и вывести ее на экран
        int counter = 0;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < 10; i++) {
            box[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + box[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            sum = sum + box[i];
        }
        System.out.println(sum);
        for (int i = 0; i < box.length; i++) {
            if (box[i] > 0)
                sum += box[i];
            counter++; // Считаем сумму положительных элементов массива и их количество
        }

        System.out.println("Сума положительных элементов массива = " + sum);
        System.out.println("Количество положительных элементов массива = " + counter);

        boolean isSorted = false;// сортировка пузырьком
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < 10 - 1; i++) {
                if (box[i] > box[i + 1]) {
                    isSorted = false;
                    buf = box[i];
                    box[i] = box[i + 1];
                    box[i + 1] = buf;
                    System.out.println(Arrays.toString(box));

                }

            }
        }
    }
}