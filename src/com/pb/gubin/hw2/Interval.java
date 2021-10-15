package com.pb.gubin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите число от 0 до 100: ");
    while (input.hasNextInt()) {
        int number = input.nextInt();
        if(number < 0 || number > 100) System.out.println("Число не соответствует диапазону {0-100}");
        else if (number >= 50){
            System.out.println("51-100");
        }
        else if (number >=36){
            System.out.println("36-50");
        }
        else if (number >=15){
            System.out.println("15-35");
        }
        else System.out.println("0-14");
    }

    }
}