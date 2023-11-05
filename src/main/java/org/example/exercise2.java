package org.example;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    String line = in.next();
        if (line == "Вячеслав"){
        System.out.println("Привет, Вячеслав");
    } else {
            System.out.println("Нет такого имени");
        }
        in.close();
    }
}

