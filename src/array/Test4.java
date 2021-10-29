package array;

import java.util.Scanner;

public class Test4 {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input mas len: ");
        int x = scanner.nextInt();

        String[] array = new String[x];


        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
