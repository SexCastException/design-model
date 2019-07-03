package com.huazai.gof.decorator;

/**
 * ConcreteDecorator具体装饰角色：负责给构件对象添加新的责任，如IO流中的BufferedInputStream和BufferedOutputStream
 */
public class FlyCar extends CarWrapper {

    public FlyCar(Car car) {
        super(car);
        this.car = car;
    }

    protected void fly() {
        System.out.println("汽车飞行");
    }

    @Override
    public void move() {
        car.move();
        fly();
    }
}
