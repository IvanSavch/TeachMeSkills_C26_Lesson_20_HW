package com.teachmeskillls.lesson20.hw.task2.task2_2;

public class Coffee extends Thread {
    public void drinkCoffee() {
        System.out.println("drink coffee");
    }

    @Override
    public void run() {
        drinkCoffee();
    }
}
