package com.huazai.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类（FlyweightFactory）：创建并管理享元对象，享元池一般设计成键值对，通过唯一标识找到找到对象的享元对象
 */
public class ShapeFactory {
    // 享元池
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String color) {
        Shape shape = shapeMap.get(color);
        if (shape == null) {
            shape = new Circle(color, 1, 3, 6);
            shapeMap.put(color, shape);
        }
        return shape;
    }
}
