package com.huazai.gof.templatemethod;

/**
 * 常见开发场景
 * spring中，JDBCTemplate和HibernateTemplate
 * 数据库的访问封装
 * 集合AbstractList等
 * Serlvet中关于doGET和doPost方法
 */
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
