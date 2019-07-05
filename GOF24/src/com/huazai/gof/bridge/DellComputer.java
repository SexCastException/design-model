package com.huazai.gof.bridge;

public class DellComputer implements Brand {
    @Override
    public void sale() {
        System.out.println("sale Dell computer");
    }
}
