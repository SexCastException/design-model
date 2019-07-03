package com.huazai.gof.decorator;

/**
 * ConcreteDecorator具体装饰角色
 */
public class WaterCar extends CarWrapper {

    public WaterCar(Car car) {
        super(car);
        this.car = car;
    }

    public void swim() {
        System.out.println("汽车在水上漂");
    }

    @Override
    public void move() {
        car.move();
        swim();
    }
}
