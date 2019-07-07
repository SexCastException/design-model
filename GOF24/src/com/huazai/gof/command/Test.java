package com.huazai.gof.command;

/**
 * 命令模式开发中常见的场景：
 * Struts2中，action的整个调用过程中就有命令模式
 * 数据库事务机制的底层实现
 * 命令的撤销哦和恢复
 */
public class Test {
    @org.junit.Test
    public void test() {
        Command command = new ConcreteCommand(new Receiver());

        Invoke invoke = new Invoke(command);

        invoke.call();
    }
}
