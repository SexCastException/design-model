package com.huazai.gof.singleton;

import java.io.Serializable;

/**
 * 懒汉式单例模式（延迟加载）
 */
public class LazyLoadSingleton implements Serializable {
    private LazyLoadSingleton() throws Exception {
        // 防止通过反射创建对象
        if (singleton != null) {
            throw new RuntimeException("单例模式不允许存存在超过一个对象");
        }
    }

    // 类加载时，不初始化此对象，延时加载，用到时再加载，占用资源低，启动相对快
    private static LazyLoadSingleton singleton;

    // 同步方法，并发访问效率低
    public static synchronized LazyLoadSingleton getInstance() throws Exception {
        if (singleton == null) {
            singleton = new LazyLoadSingleton();
        }
        return singleton;
    }

    // 反序列化时，如果定义了readResolve则直接返回此对对象返回的对象
    private Object readResolve() {
        return singleton;
    }

}
