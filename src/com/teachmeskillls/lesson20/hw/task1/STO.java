package com.teachmeskillls.lesson20.hw.task1;

public class STO {
    int car;


    public synchronized void getCar() {
        while (car < 1) {
            if (car == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        car--;
        System.out.println("1 car leave sto");
        System.out.println("car on STO: " + car);

        notify();
    }

    public synchronized void putCar() {
        while (car >= 5) {
            if (car >= 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        car++;
        System.out.println("1 car go STO");
        System.out.println("car on STO: " + car);

        notify();
    }
}
