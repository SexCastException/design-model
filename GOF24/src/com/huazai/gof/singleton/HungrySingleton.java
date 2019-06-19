package com.huazai.gof.singleton;

/**
 * 饿汉式单例模式（立即加载）
 */
public class HungrySingleton {
    private HungrySingleton() {

    }

    // 类加载时，立即初始化此对象，占用资源高，启动时相对慢
    private static HungrySingleton singleton = new HungrySingleton();

    // 不需要同步，线程安全，调用效率高
    public static HungrySingleton getInstance() {
        return singleton;
    }

}
