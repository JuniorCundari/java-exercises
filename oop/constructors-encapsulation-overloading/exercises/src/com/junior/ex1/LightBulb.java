package com.junior.ex1;

public class LightBulb {
    private String color;
    private String electricTension;
    private boolean working;

    public LightBulb() {}

    public LightBulb(String color, String electricTension, boolean working) {
        this.color = color;
        this.electricTension = electricTension;
        this.working = working;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getElectricTension() {
        return electricTension;
    }

    public void setElectricTension(String electricTension) {
        this.electricTension = electricTension;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void turnOnLamp() {
        setWorking(true);
    }

    public void turnOffLamp() {
        setWorking(false);
    }

    public void showStatus() {
        if (isWorking()) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }

    public void changeStatus() {
        if (isWorking()) {
            turnOffLamp();
        } else {
            turnOnLamp();
        }
    }
}
