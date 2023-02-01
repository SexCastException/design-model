package com.huazai.gof.advanced.proxy.one;

public class LogTank$Proxy implements Moveable {
    private Moveable proxy;

    public LogTank$Proxy(Moveable proxy) {
        this.proxy = proxy;
    }

    @Override
    public void move() throws Exception {
        System.out.println("proxy log：start");
        proxy.move();
        System.out.println("proxy log：end");
    }
}