package com.Start.Test.First;

import java.util.Scanner;

/*Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите диапозон чисел от и до:");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        for (int i = 0;i<n;i++){
            a[i] = rand(a1,a2);
        }
        System.out.println(maxElem(a,n));
        System.out.println(minElem(a,n));
        for (int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        System.out.println(averageElem(a,n));
    }

    private static int rand(int a,int b){
        return (a + (int) (Math.random() * b));
    }

    private static int maxElem(int[] array,int n){
        int max = array[0];
        for (int i = 1;i<n;i++){
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }

    private static int minElem(int[] array,int n){
        int min = array[0];
        for (int i = 1;i<n;i++){
            if (array[i]<min)
                min = array[i];
        }
        return min;
    }

    private static int averageElem(int[] array,int n){
        int average = 0;
        int sum = 0;
        for (int i = 0; i<n;i++){
            sum += array[i];
        }
        double averageOfArray = sum/n;
        int[] arrayOfAverageElem = new int[n];
        for (int i = 0;i<n;i++){
            if (array[i]<averageOfArray){
                arrayOfAverageElem[i] = (int)averageOfArray - array[i];
            }
            else if (array[i]>averageOfArray){
                arrayOfAverageElem[i] = array[i] - (int)averageOfArray;
            }
        }
        int minOfAverage = minElem(arrayOfAverageElem,n);
        for (int i = 0;i<n;i++){
            if (minOfAverage == arrayOfAverageElem[i]) {
                average = array[i];
                break;
            }
        }
        return average;
    }
}
