package com.huazai.gof.advanced.cor.proxy.two;

import com.huazai.gof.advanced.cor.proxy.one.Moveable;
import com.huazai.gof.advanced.cor.proxy.one.Tank;

import java.lang.reflect.Method;

/**
 * @author pyh
 * @date 2020/2/21 0:42
 */
public class Test$Proxy implements Moveable {
    private InvocationHandler invocationHandler = new TestInvocationHandler(new Tank());

    @Override
    public void move() throws Exception {
        invocationHandler.invoke(this, Moveable.class.getMethod("move"), null);
    }

    private class TestInvocationHandler implements InvocationHandler {
        private Moveable proxy;

        public TestInvocationHandler(Moveable proxy) {
            this.proxy = proxy;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
            System.out.println("前置通知");
            method.invoke(this.proxy, args);
            System.out.println("后置通知");
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        new Test$Proxy().move();
    }
}
