package com.junior.ex3;

public class Fish extends Animal {
    private String feature;

    public Fish() {
        this.setPaws(0);
        this.setEnvironment("Mar");
        this.setColor("Cinzenta");
        this.feature = "Barbatanas e cauda";
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Feature: " + feature;
    }
}
