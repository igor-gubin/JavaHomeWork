package com.pb.gubin.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char operation = getOperation();
        if( operand2 == 0 && operation == '/' ) {
            System.out.println("Деление на 0 недопустимо");
            return;
        }
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char sign;
        if(scanner.hasNext()){
            sign = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            sign = getOperation();
        }
        return sign;
    }

    public static int calc(int operand1, int operand2, char sign){
        int result;
        switch (sign){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());//рекурсия
        }
        return result;
    }
}
