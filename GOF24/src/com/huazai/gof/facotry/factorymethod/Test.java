package com.huazai.gof.facotry.factorymethod;

public class Test {
    @org.junit.Test
    public void test() {
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        Car benz = new BenzFactory().createCar();
        System.out.println(audi);
        System.out.println(byd);
        System.out.println(benz);
    }
}
