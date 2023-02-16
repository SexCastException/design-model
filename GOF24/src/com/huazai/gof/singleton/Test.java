package com.huazai.gof.singleton;

import org.junit.Assert;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

public class Test {
    @org.junit.Test
    public void testSingleton() throws Exception {
        long time = System.currentTimeMillis();
        DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton doubleCheckLockSingleton1 = DoubleCheckLockSingleton.getInstance();
        Assert.assertTrue(doubleCheckLockSingleton == doubleCheckLockSingleton1);
        System.out.println("双重检测锁单例模式对象创建耗费时间" + (System.currentTimeMillis() - time));

        long time1 = System.currentTimeMillis();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        Assert.assertTrue(enumSingleton == enumSingleton1);
        System.out.println("枚举单例模式对象创建耗费时间" + (System.currentTimeMillis() - time));

        long time2 = System.currentTimeMillis();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        Assert.assertTrue(hungrySingleton == hungrySingleton1);
        System.out.println("饿汉式单例模式对象创建耗费时间" + (System.currentTimeMillis() - time2));

        long time3 = System.currentTimeMillis();
        LazyLoadSingleton lazyLoadSingleton = LazyLoadSingleton.getInstance();
        LazyLoadSingleton lazyLoadSingleton1 = LazyLoadSingleton.getInstance();
        Assert.assertTrue(lazyLoadSingleton == lazyLoadSingleton1);
        System.out.println("懒汉式单例模式对象创建耗费时间" + (System.currentTimeMillis() - time3));

        long time4 = System.currentTimeMillis();
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton1 = StaticInnerClassSingleton.getInstance();
        Assert.assertTrue(staticInnerClassSingleton == staticInnerClassSingleton1);
        System.out.println("静态内部类单例模式对象创建耗费时间" + (System.currentTimeMillis() - time4));
    }

    @org.junit.Test
    public void test() throws Exception {
        LazyLoadSingleton lazyLoadSingleton = LazyLoadSingleton.getInstance();
        System.out.println(lazyLoadSingleton);

        Class<LazyLoadSingleton> clazz = (Class<LazyLoadSingleton>) Class.forName("com.huazai.gof.singleton.LazyLoadSingleton");
        Constructor<LazyLoadSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyLoadSingleton lazyLoadSingleton1 = constructor.newInstance();
        System.out.println(lazyLoadSingleton1);
    }

    @org.junit.Test
    public void testSerializable() throws Exception {
        LazyLoadSingleton lazyLoadSingleton = LazyLoadSingleton.getInstance();
        System.out.println(lazyLoadSingleton);

        String fileName = "F:\\project\\IdeaProjects\\design-pattern\\GOF24\\src\\com\\huazai\\gof\\singleton\\test.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        objectOutputStream.writeObject(lazyLoadSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(fileName)));
        LazyLoadSingleton lazyLoadSingleton1 = (LazyLoadSingleton) objectInputStream.readObject();
        System.out.println(lazyLoadSingleton1);
    }


    @org.junit.Test
    public void testPerformance() throws InterruptedException {
        long time = System.currentTimeMillis();
        int threadNum = 100;
        // 同步辅助类，在完成一组正在其他线程执行的操作之前，它允许一个或多个线程一直等待
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        try {
                            Object o = LazyLoadSingleton.getInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    // 计数器减1
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 主线程阻塞，知道计数器变为0，才会执行下一步
        countDownLatch.await();
        System.out.println(System.currentTimeMillis() - time);
    }
}


