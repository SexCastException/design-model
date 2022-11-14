package com.huazai.gof.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（克隆模式、拷贝模式）,克隆出的对象的属性值完全和原型对象相同，并且克隆出的新对象不影响原型对象
 * 实现Cloneable接口和clone方法
 * 创建效率高
 * 当要创建大量对象或者复杂对象的时候可以考虑使用克隆模式
 * <p>
 * 耗时对比：
 * new创建对象 > 深克隆 > 浅克隆
 */
public class Test {
    /**
     * 潜克隆
     *
     * @throws CloneNotSupportedException
     */
    @org.junit.Test
    public void testHiddenClone() throws CloneNotSupportedException {
        Sheep sheep = new Sheep("少莉", new Date(12345678910L));
        System.out.println(sheep);

        Sheep sheep1 = (Sheep) sheep.clone();
        sheep.getBirthday().setTime(1285);
        System.out.println(sheep1);

        System.out.println(sheep == sheep1);
        System.out.println(sheep.getBirthday() == sheep1.getBirthday());
        System.out.println(sheep.getName() == sheep1.getName());
    }

    /**
     * 深度克隆
     */
    @org.junit.Test
    public void testDeepClone() {
        Sheep sheep = new Sheep("少莉", new Date(12345678910L));
        System.out.println(sheep);

        Sheep sheep1 = getDeepSheep(sheep);
        System.out.println(sheep1);

        System.out.println(sheep == sheep1);
        System.out.println(sheep.getBirthday() == sheep1.getBirthday());
        System.out.println(sheep.getName() == sheep1.getName());
    }

    private static Sheep getDeepSheep(Sheep sheep) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(sheep);

            byte[] bytes = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Sheep sheep1 = (Sheep) objectInputStream.readObject();
            return sheep1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试不用克隆模式创建对象花费时长
     */
    @org.junit.Test
    public void testNew() {
        long start = System.currentTimeMillis();
        Sheep sheep = new Sheep();
        for (int i = 0; i < 1000; i++) {
            Sheep s = new Sheep();
        }
        long end = System.currentTimeMillis();
        System.out.println("通过new创建对象所耗时" + (end - start));
    }

    /**
     * 测试浅克隆创建对象花费时长
     *
     * @throws CloneNotSupportedException
     */
    @org.junit.Test
    public void testClone() throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Sheep sheep = new Sheep();
        for (int i = 0; i < 1000; i++) {
            Sheep s = (Sheep) sheep.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("通过clone的对象所耗时" + (end - start));
    }

    /**
     * 测试深克隆创建对象花费时长
     *
     * @throws CloneNotSupportedException
     */
    @org.junit.Test
    public void testClone1() throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Sheep sheep = new Sheep();
        for (int i = 0; i < 1000; i++) {
            Sheep s = getDeepSheep(sheep);
        }
        long end = System.currentTimeMillis();
        System.out.println("通过clone的对象所耗时" + (end - start));
    }
}
