package com.huazai.gof.strategy;

public class Test {
    @org.junit.Test
    public void test() {
        Context context = new Context(new NewCustomerFewStrategy());
        context.getPrice(100);

        context.setStrategy(new OldCustomerManyStrategy());
        context.getPrice(100);
    }
}
