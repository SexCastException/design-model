package com.huazai.gof.templatemethod;

public class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
