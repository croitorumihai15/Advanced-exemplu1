package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car mercedes = new Car("s-class", 200);
        Car volvo = new Car("XC60", 130);
        Car bmw = new Car("x6", 220);

        mercedes.setSpeed(-400);
        System.out.println("the car goes with the speed of " + mercedes.getSpeed());




    }
}

