package com.Start.Test.Third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Простые числа:");
        for (int i = 0; i < a.length; i++) {
            boolean temp = true;
            if (a[i] > 2) {
                for (int j = 2; j < (int)Math.sqrt(a[i]); j++) {
                    if (a[i]%j==0 && a[i]!=j) {
                        temp = false;
                        break;
                    }
                }
                if (temp == true)
                    System.out.print(a[i]+" ");
            }
            else System.out.print(a[i]+" ");
        }
    }
}
