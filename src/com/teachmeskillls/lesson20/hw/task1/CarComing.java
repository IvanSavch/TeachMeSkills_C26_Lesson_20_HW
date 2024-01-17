package com.teachmeskillls.lesson20.hw.task1;

import com.teachmeskillls.lesson20.hw.task1.constant.MaxCar;

public class CarComing implements Runnable {
    private STO sto;

    public CarComing(STO sto) {
        this.sto = sto;
    }
    public void carInput() {
        for (int i = 0; i < MaxCar.maxCar; i++) {
            sto.putCar();
        }

    }

    @Override
    public void run() {
        carInput();
    }
}
