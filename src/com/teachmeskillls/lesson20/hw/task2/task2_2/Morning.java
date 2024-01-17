package com.teachmeskillls.lesson20.hw.task2.task2_2;

public class Morning {


    public static void main(String[] args) {
        ReadNews readNews = new ReadNews();
        Coffee coffee = new Coffee();
        Breakfast breakfast = new Breakfast();
        readNews.start();
        coffee.start();
        breakfast.start();
    }
}
