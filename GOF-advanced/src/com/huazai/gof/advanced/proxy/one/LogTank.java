package com.huazai.gof.advanced.proxy.one;

/**
 * @author pyh
 * @date 2020/2/19 18:18
 */
public class LogTank implements Moveable {
    private Moveable proxy;

    public LogTank(Moveable proxy) {
        this.proxy = proxy;
    }

    @Override
    public void move() throws Exception {
        System.out.println("log：start");
        proxy.move();
        System.out.println("log：end");
    }
}
