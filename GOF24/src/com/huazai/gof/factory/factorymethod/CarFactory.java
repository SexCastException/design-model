package com.huazai.gof.factory.factorymethod;

/**
 * 为了避免简单工厂模式的缺点，即不完全满足OCP
 * 工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个工厂类，而工厂方法模式有一组实现了相同的接口的工厂类
 */
public interface CarFactory {
    Car createCar();
}
