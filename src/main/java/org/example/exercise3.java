package org.example;


import java.util.Scanner;

public class exercise3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Элементы кратные 3");
            for (int i = 0; i < length; i++){
                if (array[i] % 3 == 0) {
                    System.out.println(array[i]);
                }
            }

        }
}
