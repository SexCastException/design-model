package com.huazai.gof.bridge;

/**
 * 处理多层集成结构，处理多维度变化的场景，将各个维度设计成独立的集成结构，使各个维度可以独立的扩展在抽象层建立关联
 *
 * 单一原则：
 *
 * 应用场景：JDBC驱动；格式分类：操作日志、交易日志、异常日志；距离分类：本地记录日志、异地记录日志
 */
public class Test {
    @org.junit.Test
    public void test() {
        Computer lenovoDesktop = new Desktop(new LenovoComputer());
        lenovoDesktop.sale();
        System.out.println("------------------");

        Computer lenovoLaptop = new Laptop(new LenovoComputer());
        lenovoLaptop.sale();
        System.out.println("------------------");

        Computer dellDesktop = new Desktop(new DellComputer());
        dellDesktop.sale();
    }
}
