package com.pb.gubin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    // Циклическая конструкция - while.

    public static void main(String[] args) {
        System.out.println("Угадайте число в диапазоне от 0 до 100.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 5; // Допустимое количество попыток.
        int attempt = 0;           // Счетчик попыток.
        Random random = new Random();
        int number = random.nextInt(100);

        try (Scanner in = new Scanner(System.in)) {

            while (attempt < MAX_ATTEMPT) {
                attempt++;
                System.out.println("Попытка " + attempt + ":");
                String value = in.next();
                System.out.println("rand: " +number );

                if (value.equals("exit")) {
                    break;

                }

                int  v=Integer.parseInt(value);

                if (v < number) {
                    System.out.println("Ваше число меньше");
                    continue;
                }
                if (v > number) {
                    System.out.println("Ваше число больше");
                    continue;
                }

                if (v == number) {
                    System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                    break;
                }

            }
        }

        System.out.println("Конец игры!");
    }
}
