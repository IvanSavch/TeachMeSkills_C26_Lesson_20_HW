package com.teachmeskillls.lesson20.hw.task1;

public class Runner {
    /**
     * 1. There is a service station. There can be a maximum of a certain number of cars in service per hundred.
     * Create a class that will run in a separate thread and will add cars for service at the service station.
     * Create a class that will run in a separate thread and will pick up fixed cars from the service station.
     * Let the maximum number of machines available for service be specified in the interface for storing constants.
     * Use synchronized, wait, notify.
     */
    public static void main(String[] args) {
        STO sto = new STO();
        CarComing carInput = new CarComing(sto);
        CarLeave carOut = new CarLeave(sto);
        Thread input = new Thread(carInput);
        Thread output = new Thread(carOut);
        input.start();
        output.start();

    }
}
