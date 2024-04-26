package com.junior.ex3;

public class TestZoo {
    public static void main(String[] args) {

        Animal camel = new Animal();
        camel.setName("Camelo");
        camel.setLength(150);
        camel.setColor("Amarelo");
        camel.setEnvironment("Terra");
        camel.setSpeed(2.0);

        Fish shark = new Fish();
        shark.setName("Tubarão");
        shark.setLength(300);
        shark.setSpeed(1.5);

        Mammal bear = new Mammal();
        bear.setName("Urso-do-Canadá");
        bear.setLength(180);
        bear.setColor("Vermelho");
        bear.setEnvironment("Terra");
        bear.setSpeed(0.5);
        bear.setFood("Mel");

        Animal[] animals = new Animal[3];
        animals[0] = camel;
        animals[1] = shark;
        animals[2] = bear;

        System.out.println("Zoo:");
        System.out.println("---------------------------");

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("---------------------------");
        }
    }
}
