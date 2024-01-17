package com.teachmeskillls.lesson20.hw.task2.task2_2;

public class ReadNews extends Thread {
    public void readNews() {
        System.out.println("Read news");
    }

    @Override
    public void run() {
        readNews();
    }
}
