package com.huazai.gof.templatemethod;

public class SaveMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要存钱");
    }
}
