package com.huazai.gof.decorator;

/**
 * Decorator装饰角色，持有一个抽象构建的引用。如IO流中的FilterInputStream、FilterOutputStream
 *
 */
public class CarWrapper implements Car {
    protected Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
