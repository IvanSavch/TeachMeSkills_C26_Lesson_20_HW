package com.teachmeskillls.lesson20.hw.task1;

public class Runner {
    public static void main(String[] args) {
        STO sto = new STO();
        CarInput carInput = new CarInput(sto);
        CarOut carOut = new CarOut(sto);
        Thread input = new Thread(carInput);
        Thread output = new Thread(carOut);
        input.start();
        output.start();

    }
}
