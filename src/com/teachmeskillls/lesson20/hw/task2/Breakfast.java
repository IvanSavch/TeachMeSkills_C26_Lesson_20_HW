package com.teachmeskillls.lesson20.hw.task2;

public class Breakfast implements Runnable {
    public void breakfast() {
        System.out.println("Eat breakfast");
    }

    @Override
    public void run() {
        breakfast();
    }
}
