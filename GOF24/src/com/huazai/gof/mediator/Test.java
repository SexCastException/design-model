package com.huazai.gof.mediator;

/**
 * 中介者模式（Mediator）：解耦多个同事对象之间的交互关系，每个对象都持有中介者对象的引用，只跟中介者对象打交道，通过中介者统一管理这些交互关系
 * 开发常见的场景：
 * 1、MVC模式中的C，控制器就是一个中介者模式,M和V都和C打交道，C负责处理M和V的数据交互
 * 2、机场调度系统
 * 3、JAVA图形界面GUI中，通过中介者来处理多个组件之间的交互
 */
public class Test {
    @org.junit.Test
    public void test() {
        Mediator president = new President();
        Department development = new Development(president);
        Department financail = new Financial(president);
        Department market = new Market(president);

        development.outAction();
        financail.outAction();
        market.outAction();
    }
}
