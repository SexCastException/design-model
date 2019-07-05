package com.huazai.gof.flyweight;

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
