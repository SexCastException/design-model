package com.huazai.gof.flyweight;

/**
 * 抽象享元类（Flyweight）：通常是一个接口或抽象类，生成公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态
 */
public interface Shape {
    void draw();
}
