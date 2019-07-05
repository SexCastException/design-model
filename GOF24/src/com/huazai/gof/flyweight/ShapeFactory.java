package com.huazai.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
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
