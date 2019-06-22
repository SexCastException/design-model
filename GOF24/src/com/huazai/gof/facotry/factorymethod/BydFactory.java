package com.huazai.gof.facotry.factorymethod;

public class BydFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Byd();
    }
}
