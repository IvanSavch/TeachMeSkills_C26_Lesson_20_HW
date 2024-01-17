package com.teachmeskillls.lesson20.hw.task2;

public class Morning {
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
