package com.huazai.gof.factory.simplefacotry;

import java.rmi.NoSuchObjectException;

public class Test {
    @org.junit.Test
    public void test() {
        Car car1 = new Audi();
        car1.run();
        Car car2 = new Byd();
        car2.run();
    }

    @org.junit.Test
    public void test1() throws NoSuchObjectException {
        String type = "Audi";
        Car car = CarFactory.createCar(type);
        System.out.println(car);
    }
}
