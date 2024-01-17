package com.teachmeskillls.lesson20.hw.task2.task2_2;

public class Breakfast extends Thread {
    public void breakfast() {
        System.out.println("Eat breakfast");
    }

    @Override
    public void run() {
        breakfast();
    }
}
