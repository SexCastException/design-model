package com.huazai.gof.singleton;

/**
 * 懒汉式单例模式（延迟加载）
 */
public class LazyLoadSingleton {
    private LazyLoadSingleton() {

    }
    // 类加载时，不初始化此对象，延时加载，用到时再加载，占用资源低，启动相对快
    private static LazyLoadSingleton singleton;

    // 同步方法，并发访问效率低
    public static synchronized LazyLoadSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyLoadSingleton();
        }
        return singleton;
    }

}
