package com.huazai.gof.factory.simplefacotry;

import java.rmi.NoSuchObjectException;

/**
 * 简单工厂模式也叫静态工厂模式，就是工厂类一般是使用静态方法
 * 通过接受的参数的不同来返回不同对象的实例
 * 对于增加新产品无能为力，不能修改代码的话是无法扩展的，违反了开闭原则(OCP)
 */
public class CarFactory {
    public static Car createCar(String type) throws NoSuchObjectException {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Byd".equals(type)) {
            return new Byd();
        } else {
            throw new NoSuchObjectException("不存在该种车型");
        }
    }
}
