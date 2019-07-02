package com.huazai.gof.proxy.staticProxy;

public class Test {
    @org.junit.Test
    public void test() {
        Star zhoujielun = new RealStar();
        ProxyStar proxyStar = new ProxyStar(zhoujielun);

        proxyStar.confer();
        proxyStar.bookTicket();
        proxyStar.singe();
        proxyStar.collectMoney();
    }
}
