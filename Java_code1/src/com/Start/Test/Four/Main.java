package com.Start.Test.Four;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a= {1,1,2,0,5,3,8,4,3,3,3,8,5,3};

        System.out.println(Arrays.toString(removeElem(a,3)));
    }



    private static int[] removeElem(int[] array,int val){
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val){
                offset++;
            }
            else{
                array[i-offset] = array[i];
            }
        }




        return Arrays.copyOf(array,array.length - offset);
    }
}
