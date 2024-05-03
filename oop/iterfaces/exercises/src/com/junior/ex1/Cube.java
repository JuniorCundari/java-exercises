package com.junior.ex1;

public class Cube extends Figure3D {
    private int edge;

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return 6 * (edge * edge);
    }

    @Override
    public double calculateVolume() {
        return (edge * edge) * edge;
    }
}
