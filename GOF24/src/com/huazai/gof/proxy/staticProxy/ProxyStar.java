package com.huazai.gof.proxy.staticProxy;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("proxy confer");
    }

    @Override
    public void signContract() {
        System.out.println("proxy signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("proxy bookTicket");
    }

    @Override
    public void singe() {
        System.out.println("log：真实歌手开始唱歌");
        star.singe();
        System.out.println("log：真实歌手结束唱歌");
    }

    @Override
    public void collectMoney() {
        System.out.println("proxy collectMoney");
    }
}
