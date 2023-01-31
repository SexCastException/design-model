package com.huazai.gof.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star readlStar;

    public StarHandler(Star readlStar) {
        this.readlStar = readlStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object o = method.invoke(readlStar, args);
        System.out.println("后置通知");
        return proxy;
    }
}
