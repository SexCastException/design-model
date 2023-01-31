package com.huazai.gof.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    @org.junit.Test
    public void test() {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.singe();
        proxy.bookTicket();
        proxy.signContract();
        proxy.confer();
    }
}
