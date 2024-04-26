package com.junior.ex3;

public class Animal {
    private String name;
    private int length;
    private int paws;
    private String color;
    private String environment;
    private double speed;

    public Animal() {
        setPaws(4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal: " + name + '\n' +
                "Length: " + length + " cm" + '\n' +
                "Paws: " + paws + '\n' +
                "Color: " + color + '\n' +
                "Environment: " + environment + '\n' +
                "Speed: " + speed + " m/s";
    }
}
