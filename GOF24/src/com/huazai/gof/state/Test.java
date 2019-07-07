package com.huazai.gof.state;

public class Test {
    @org.junit.Test
    public void test() {
        Context context = new Context(new BookedState());
        context.consult();

        context.setState(new FreeSate());
        context.consult();
    }
}
