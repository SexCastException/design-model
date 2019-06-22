package com.huazai.gof.facotry.factorymethod;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
