package com.Start.Test.Two.Six;


/*
Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
*/


public class Main {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        int[] a = {1,2,3};
        int[] b = {1,2,10};
        Generator generator = new Generator(a,b);
        System.out.println(generator.randomElem());
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
