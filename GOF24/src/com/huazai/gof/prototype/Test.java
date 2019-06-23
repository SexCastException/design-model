package com.huazai.gof.prototype;

import java.io.*;
import java.util.Date;

/**
 * 原型模式（克隆模式、拷贝模式）,克隆出的对象的属性值完全和原型对象相同，并且克隆出的新对象不影响原型对象
 * 实现Cloneable接口和clone方法
 * 创建效率高
 * 当要创建大量对象或者复杂对象的时候可以考虑使用克隆模式
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
    }

    /**
     * 深度克隆
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @org.junit.Test
    public void testDeepClone() throws IOException, ClassNotFoundException {
        Sheep sheep = new Sheep("少莉", new Date(12345678910L));
        System.out.println(sheep);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sheep);

        byte[] bytes = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Sheep sheep1 = (Sheep) objectInputStream.readObject();
        System.out.println(sheep1);

        System.out.println(sheep == sheep1);
        System.out.println(sheep.getBirthday() == sheep1.getBirthday());
    }

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
}
