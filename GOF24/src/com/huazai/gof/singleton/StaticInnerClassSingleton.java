package com.huazai.gof.singleton;

/**
 * 静态内部类单例模式（延迟加载）
 * 1、外部类没有static属性，不像饿汉式那样立即加载对象
 * 2、只有真正调用getInstance方法才会加载静态内部类。加载类时是线程安全的
 * 3、兼备了并发高效调用和延迟加载的优势
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    private static class SingletonClassInstance {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return new SingletonClassInstance().singleton;
    }


}
