package com.huazai.gof.proxy.dynamicProxy;

public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("realStar confer");
    }

    @Override
    public void signContract() {
        System.out.println("realStar signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("realStar bookTicket");
    }

    @Override
    public void singe() {
        System.out.println("realStar singe");
    }

    @Override
    public void collectMoney() {
        System.out.println("realStar collectMoney");
    }
}
