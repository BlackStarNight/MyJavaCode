package com.Start.Test.Two.Six;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,10};
        Generator generator = new Generator(a,b);
        System.out.println(generator.randomElem());
    }
}
