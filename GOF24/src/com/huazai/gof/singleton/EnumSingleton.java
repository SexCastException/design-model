package com.huazai.gof.singleton;

/**
 * 枚举单例模式（立即加载）
 * 优点：实现简单；枚举本身就是单例模式；由于JVM从根本上提供保障高，避免了通过反射和反序列化的漏洞
 * 缺点：无延迟加载
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {

    }

    public void operationHere() {

    }
}
