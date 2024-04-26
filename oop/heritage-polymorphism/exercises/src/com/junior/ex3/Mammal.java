package com.junior.ex3;

public class Mammal extends Animal {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Food: " + food;
    }
}
