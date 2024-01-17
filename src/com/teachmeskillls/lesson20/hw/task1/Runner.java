package com.teachmeskillls.lesson20.hw.task1;

public class Runner {
    public static void main(String[] args) {
        STO sto = new STO();
        CarComing carInput = new CarComing(sto);
        CarLeave carOut = new CarLeave(sto);
        Thread input = new Thread(carInput);
        Thread output = new Thread(carOut);
        input.start();
        output.start();

    }
}
