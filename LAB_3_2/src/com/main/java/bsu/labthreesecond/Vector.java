package com.main.java.bsu.labthreesecond;


import javafx.geometry.Point3D;

public class Vector
{
    private Point3D pointA;
    private Point3D pointB;

    public Vector(Point3D pointA, Point3D pointB)
    {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point3D getCoordinates()
    {
        return new Point3D((pointB.getX() - pointA.getX()), (pointB.getY() - pointA.getY()), (pointB.getZ() - pointA.getZ()));
    }

    public double getModule()
    {
        Point3D coordinates = this.getCoordinates();
        return Math.sqrt(Math.pow(coordinates.getX(), 2) + Math.pow(coordinates.getY(), 2) + Math.pow(coordinates.getZ(), 2));
    }

    public Point3D getVectorsSumm(Vector anotherVector)
    {
        Point3D coordinatesThis = this.getCoordinates();
        Point3D coordinatesAnother = anotherVector.getCoordinates();

        return new Point3D(coordinatesThis.getX() + coordinatesAnother.getX(), coordinatesThis.getY() + coordinatesAnother.getY(), coordinatesThis.getZ() + coordinatesAnother.getZ());
    }

    public Point3D getVectorsDifference(Vector anotherVector)
    {
        Point3D coordinatesThis = this.getCoordinates();
        Point3D coordinatesAnother = anotherVector.getCoordinates();

        return new Point3D(coordinatesThis.getX() - coordinatesAnother.getX(), coordinatesThis.getY() - coordinatesAnother.getY(), coordinatesThis.getZ() - coordinatesAnother.getZ());
    }

    public Point3D getMultiplication(double number)
    {
        Point3D coordinatesThis = this.getCoordinates();
        return new Point3D(coordinatesThis.getX() * number, coordinatesThis.getY() * number, coordinatesThis.getZ() * number);
    }

    public double getScalarMultiplication(Vector anotherVector)
    {
        Point3D coordinatesThis = this.getCoordinates();
        Point3D coordinatesAnother = anotherVector.getCoordinates();

        return (coordinatesThis.getX() * coordinatesAnother.getX()) + (coordinatesThis.getY() * coordinatesAnother.getY()) + (coordinatesThis.getZ() * coordinatesAnother.getZ());
    }

    public Boolean isCollinear(Vector anotherVector)
    {
        Point3D coordinatesThis = this.getCoordinates();
        Point3D coordinatesAnother = anotherVector.getCoordinates();

        double x = coordinatesThis.getX() / coordinatesAnother.getX();
        double y = coordinatesThis.getY() / coordinatesAnother.getY();
        double z = coordinatesThis.getZ() / coordinatesAnother.getZ();

        return x == y && x == z;
    }

}
