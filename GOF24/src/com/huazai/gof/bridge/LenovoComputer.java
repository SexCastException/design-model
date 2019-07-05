package com.huazai.gof.bridge;

public class LenovoComputer implements Brand {
    @Override
    public void sale() {
        System.out.println("sale lenovo computer");
    }
}
