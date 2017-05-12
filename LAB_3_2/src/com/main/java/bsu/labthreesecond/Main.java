package com.main.java.bsu.labthreesecond;

import javafx.geometry.Point3D;

import java.util.Random;

public class Main {
    private static final int CONSTANT_NUMBER = 3;

    public static void main(String[] args) {
        Vector[] vectors = new Vector[]{getRandomVector(), getRandomVector()};

        System.out.println("Координаты вектора 1: " + vectors[0].getCoordinates());
        System.out.println("Координаты вектора 2: " + vectors[1].getCoordinates());
        System.out.println("Сложение векторов: " + vectors[0].getVectorsSumm(vectors[1]));
        System.out.println("Вычитание векторов: " + vectors[0].getVectorsDifference(vectors[1]));
        System.out.println("Умножение на константу вектора 1: " + vectors[0].getMultiplication(CONSTANT_NUMBER));
        System.out.println("Скалярное произведение: " + vectors[0].getScalarMultiplication(vectors[1]));
        System.out.println("Модуль вектора 1: " + vectors[0].getModule());
        System.out.println("Проверка на колинеарность векторов: " + vectors[0].isCollinear(vectors[1]));
    }

    public static Vector getRandomVector() {
        Random random = new Random();
        Point3D pointA = new Point3D(random.nextInt(3), random.nextInt(3), random.nextInt(3));
        Point3D pointB = new Point3D(random.nextInt(3), random.nextInt(3), random.nextInt(3));

        return new Vector(pointA, pointB);
    }
}
