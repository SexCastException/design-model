package com.huazai.gof.templatemethod;

public class Test {
    @org.junit.Test
    public void test() {
        BankTemplateMethod drawMoney = new DrawMoney();
        drawMoney.process();

        System.out.println("----------");

        BankTemplateMethod saveMoney = new SaveMoney();
        saveMoney.process();

        System.out.println("----------");

        new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("转账");
            }
        }.transact();

    }
}
