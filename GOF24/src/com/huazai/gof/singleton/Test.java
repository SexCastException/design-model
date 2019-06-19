package com.huazai.gof.singleton;

import org.junit.Assert;

import java.util.concurrent.CountDownLatch;

public class Test {
    @org.junit.Test
    public void testSingleton() {
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
}
