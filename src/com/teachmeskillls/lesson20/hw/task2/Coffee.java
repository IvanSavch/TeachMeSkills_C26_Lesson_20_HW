package com.teachmeskillls.lesson20.hw.task2;

public class Coffee implements Runnable {
    public void drinkCoffee() {
        System.out.println("drink coffee");
    }

    @Override
    public void run() {
        drinkCoffee();
    }
}
