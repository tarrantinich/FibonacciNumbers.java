package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача: вывести N числел Фибоначчи");
        System.out.println("Введите число N:");
        int number = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        if (number == 1){
            System.out.print("0");
        }else {
            System.out.print(n1 + " ");
            System.out.print(n2 + " ");
            for (int i = 0; i < number - 2; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
