package com.huazai.gof.factory.factorymethod;

/**
 * 简单工厂模式和工厂方法模式PK：
 * 结构复杂度：简单工厂结构简单，只需要一个工厂类，而工厂方法模式的工厂类随着产品类的个数增加而增加，这无疑使类的个数越来越多，增加了结构的复杂度
 * 代码复杂度：结构复杂度和代码复杂度是互斥的。简单工厂方法模式结构简单，代码相对复杂；工厂方法模式结构复杂，代码简单
 * 客户端编程难度：工厂方法模式虽然完全满足了OCP，但在客户端编码中需要对工厂类进行实例化，而简单工厂模式的工厂类通过静态方法来调用，无需实例化，这无疑是个优点
 * 管理上的难度：如果某个产品类需要修改，，很可能需要修改相应的工厂类，当同时需要修改多个产品的时候，对工厂类的修改就会变得相当麻烦，反而简单工厂只需要修改少量的代码
 */
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
