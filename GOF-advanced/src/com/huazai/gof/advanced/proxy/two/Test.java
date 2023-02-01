package com.huazai.gof.advanced.proxy.two;

import com.huazai.gof.advanced.proxy.one.Moveable;
import com.huazai.gof.advanced.proxy.one.Tank;

/**
 * @author pyh
 * @date 2020/2/20 18:52
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Moveable o = (Moveable) Proxy.newProxyInstance(Moveable.class, new MoveInvocationHandler(new Tank()));
        o.move();
        System.out.println(o);
    }
}
