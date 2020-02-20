package com.huazai.gof.advanced.cor.proxy.one;

/**
 * @author pyh
 * @date 2020/2/19 18:12
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        Moveable moveable = new TimeTank(new LogTank(new Tank()));
//        moveable.move();
        Moveable o = (Moveable) Proxy.newProxyInstance();
        o.move();
    }
}
