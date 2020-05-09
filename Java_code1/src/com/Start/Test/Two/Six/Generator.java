package com.Start.Test.Two.Six;

public class Generator {

    private int[] array;
    private int[] array_weight;

    public Generator(int[] array, int[] array_weight){
        this.array = array;
        this.array_weight = array_weight;
    }

    public int randomElem(){
        int sum = 0;
        //длинна всего веса
        for (int i = 0; i < array_weight.length; i++) {
            sum += array_weight[i];
        }
        //Получение рандомной цифры
        int number = (int)(Math.random()*sum);
        System.out.println("рандомный номер: "+number);
        int check = 0;
        for (int i = 0; i < array_weight.length; i++) {
            for (int j = 0; j < array_weight[i]; j++) {
                if (number != 0){
                    number--;
                }
                else {
                    check = i;
                    break;
                }
            }
            if (number == 0) {
                check = i;
                break;
            }
        }
        return (array[check]);
    }
}
