package com.huazai.gof.factory.abstractfactory;

/**
 * 抽象工厂模式
 * 用来生产不同产品族的全部产品，对于增加新的产品无能为力，支持增加产品族
 * 抽象工厂模式是简单工厂模式的升级版本，在有多个业务品种、业务分类时，通过抽象工厂模式产生需要的对象是一种非常好的解决方式。
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
