package com.huazai.gof.advanced.cor.proxy.two;

import com.huazai.gof.advanced.cor.proxy.one.Moveable;

import java.lang.reflect.Method;

/**
 * @author pyh
 * @date 2020/2/20 19:47
 */
public class MoveInvocationHandler implements InvocationHandler {
    private Moveable proxy;

    public MoveInvocationHandler(Moveable proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("前置通知，代理对象：" + proxy);
        method.invoke(this.proxy, args);
        System.out.println("后置通知，代理对象：" + proxy);
        return null;
    }
}
