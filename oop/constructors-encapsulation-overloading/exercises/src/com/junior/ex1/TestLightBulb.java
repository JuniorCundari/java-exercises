package com.junior.ex1;

public class TestLightBulb {
    public static void main(String[] args) {

        LightBulb lightBulb = new LightBulb();

        lightBulb.turnOffLamp();
        lightBulb.showStatus();

        lightBulb.changeStatus();
        lightBulb.showStatus();
    }
}