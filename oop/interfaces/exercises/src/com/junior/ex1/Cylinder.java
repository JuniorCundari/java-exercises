package com.junior.ex1;

public class Cylinder extends Figure3D {
    private int height;
    private double radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double baseArea = Math.PI * (radius * radius);
        double sideArea = 2 * Math.PI * radius * height;

        return (2 * baseArea) + sideArea;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * (radius * radius) * height;
    }
}
