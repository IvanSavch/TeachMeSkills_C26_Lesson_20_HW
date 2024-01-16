package com.teachmeskillls.lesson20.hw.task1;

import com.teachmeskillls.lesson20.hw.task1.constant.MaxCar;

public class CarOut implements Runnable {
    private STO sto;

    public CarOut(STO sto) {
        this.sto = sto;
    }

    public void leave() {
        for (int i = 0; i < MaxCar.maxCar; i++) {
            sto.getCar();
        }

    }

    @Override
    public void run() {
        leave();
    }
}
