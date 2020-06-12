package com.company;

public class CarException extends Exception {
    private int x;

    public CarException(int x) {
        this.x = x;
    }

    public String getMessage(Car model) {
        return "Автомобиль " +model.getModel()+" не завелся";
    }
}
