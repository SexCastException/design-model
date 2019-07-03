package com.huazai.gof.decorator;

/**
 * ConcreteComponent具体构建角色（被装饰者），如IO流的FileInputStream、FileOutputStream等
 */
public class RealCar implements Car {
    @Override
    public void move() {
        System.out.println("汽车在陆地上奔驰");
    }
}
