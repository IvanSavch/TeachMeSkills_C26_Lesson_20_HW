package com.teachmeskillls.lesson20.hw.task2;

public class ReadNews implements Runnable {
    public void readNews() {
        System.out.println("Read news");
    }

    @Override
    public void run() {
        readNews();
    }
}
