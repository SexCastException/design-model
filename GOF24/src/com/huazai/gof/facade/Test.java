package com.huazai.gof.facade;

public class Test {
    @org.junit.Test
    public void test() {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startup();
        System.out.println("------------------");
        computerFacade.shutdown();
    }
}
