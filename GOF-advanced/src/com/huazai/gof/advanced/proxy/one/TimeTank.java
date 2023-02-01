package com.huazai.gof.advanced.proxy.one;

/**
 * @author pyh
 * @date 2020/2/19 18:14
 */
public class TimeTank implements Moveable {

    private Moveable proxy;

    public TimeTank(Moveable proxy) {
        this.proxy = proxy;
    }

    @Override
    public void move() throws Exception {
        long startTime = System.currentTimeMillis();
        System.out.println("startTime：" + startTime);
        proxy.move();
        System.out.println("use Time：" + (System.currentTimeMillis() - startTime));
    }
}
