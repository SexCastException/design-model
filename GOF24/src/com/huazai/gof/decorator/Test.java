package com.huazai.gof.decorator;

/**
 * 装饰模式（包装模式）
 */
public class Test {
    @org.junit.Test
    public void test() {
//        Car car = new RealCar();
//        car.move();

//        FlyCar flyCar = new FlyCar(car);
//        flyCar.move();

        WaterCar waterCar = new WaterCar(new FlyCar(new RealCar()));
//        waterCar.move();

        FlyCar flyCar = new FlyCar(new WaterCar(new WaterCar(new FlyCar(new RealCar()))));
        flyCar.move();
    }
}
