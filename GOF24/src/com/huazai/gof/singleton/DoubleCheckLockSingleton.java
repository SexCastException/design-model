package com.huazai.gof.singleton;

/**
 * 双重检测锁单例模式（延迟加载）
 * 将同步内容下方到if内部，提高了执行的效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没有必要同步了
 * 缺点：
 * 1、由于编译器优化原因和JVM底层内部模型（对象的创建和赋值是分开的并且不能保证二者的顺序）的原因，偶尔会出现问题，不建议使用
 */
public class DoubleCheckLockSingleton {
    private DoubleCheckLockSingleton() {
    }

    private static DoubleCheckLockSingleton singleton = null;

    public static DoubleCheckLockSingleton getInstance() {
        if (singleton == null) {
            DoubleCheckLockSingleton doubleCheckLockSingleton;
            synchronized (DoubleCheckLockSingleton.class) {
                doubleCheckLockSingleton = singleton;
                if (doubleCheckLockSingleton == null) {
                    synchronized (DoubleCheckLockSingleton.class) {
                        if (doubleCheckLockSingleton == null) {
                            doubleCheckLockSingleton = new DoubleCheckLockSingleton();
                        }
                    }
                }
            }
            singleton = doubleCheckLockSingleton;
        }
        return singleton;
    }
}
