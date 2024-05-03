package com.junior.ex1;

public class Pyramid extends Figure3D {
    private double height;
    private double edge;
    private double apothem;
    private int basePolygon;

    private Figure2D base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public int getBasePolygon() {
        return basePolygon;
    }

    public void setBasePolygon(int basePolygon) {
        this.basePolygon = basePolygon;
    }

    public Figure2D getBase() {
        return base;
    }

    public void setBase(Figure2D base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        if (base != null) {
            return (basePolygon * ((edge * apothem) / 2) + base.calculateArea());
        }

        return 0;
    }

    @Override
    public double calculateVolume() {
        if (base != null) {
            return (base.calculateArea() * height);
        }

        return 0;
    }
}
