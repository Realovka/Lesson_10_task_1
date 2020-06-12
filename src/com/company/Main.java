package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("Audi", 250, 25000);
        Car bmw = new Car("BMW", 200, 15000);
        Car renault = new Car("Renault", 230, 12000);

        Car[] cars = {audi, bmw, renault};
        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].start();
            } catch (CarException e) {
                System.out.println(e.getMessage(cars[i]));
            }
        }
    }
}
