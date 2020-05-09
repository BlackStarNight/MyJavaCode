package com.Start.Test.Two.Five;


/*
 Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
конструктор с параметрами в виде списка координат x, y, z
метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
метод, вычисляющий скалярное произведение:
метод, вычисляющий векторное произведение с другим вектором:
метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
методы для суммы и разности:
статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 */

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return this.x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double rootNum(){
        return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
    }

    @Override
    public String toString(){
        return ("X: "+x+",Y: "+y+",Z: "+z+";");
    }

    public double scalarProduct(Vector b){
        return (x*b.getX()+y*b.getY()+z*b.getZ());
    }

    public Vector vectorProduct(Vector b){
        return new Vector(
                (y*b.getZ() - z*b.getY()) ,
                (z*b.getX() - x*b.getZ()) ,
                (x*b.getY()-y*b.getX()));
    }

    public double cos(Vector b){
        return (scalarProduct(b) / (rootNum()*b.rootNum()));
    }

    public Vector sum(Vector b){
        return new Vector(
                x + b.getX(),
                y + b.getY(),
                z + b.getZ());
    }

    public Vector residual(Vector b){
        return new Vector(
                x - b.getX(),
                y - b.getY(),
                z - b.getZ());
    }

    public static Vector[] staticVector(int N){
        Vector[] array = new Vector[N];
        for (int i = 0; i < N; i++) {
            array[i] = new Vector(Math.random()*10,Math.random()*10,Math.random()*10);
        }
        return array;
    }
}
