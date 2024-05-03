package com.junior.ex1;

public class Square extends Figure2D {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
