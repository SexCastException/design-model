package com.huazai.gof.flyweight;

/**
 * 享元模式以共享的方式高效地支持大量的细粒度对象的重用
 * 享元模式区分了内部状态和内部状态
 * 内部状态：可以共享，不会随着环境的变化而变化
 * 外部环境：不可以共享，会随着环境的变化而变化
 */
public class Test {
    @org.junit.Test
    public void test() {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    private String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
