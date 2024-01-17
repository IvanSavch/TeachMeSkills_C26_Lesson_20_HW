package com.teachmeskillls.lesson20.hw.task2;

public class Morning {
    /**
     * 2. Create a program that simulates morning: reading the news, tomorrow, coffee.
     * Each thread is given a name and priority from the config file.
     * Let there be 3 threads.
     * Create and run 3 threads.
     * Make two options: using the Runnable interface and using the Thread class.
     */
    public static void main(String[] args) {
        Breakfast breakfastM = new Breakfast();
        Coffee coffeeM = new Coffee();
        ReadNews readNewsM = new ReadNews();
        Thread readNews = new Thread(readNewsM);
        Thread coffee = new Thread(coffeeM);
        Thread breakfast = new Thread(breakfastM);
        readNews.start();
        breakfast.start();
        coffee.start();
    }
}
