package com.huazai.gof.command;

/**
 * Invoker：命令调用者和发起者
 * 请求的发送者，他通过命令对象来执行请求，一个调用者并不需要在设计时确定其接收者，因此他只与抽象命令类之间存在关联。
 * 在程序运行时，将调用命令对象的execute方法，简介调用接收者的相关操作。
 */
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    /**
     * 命令调用方法
     */
    public void call() {
        command.execute();
    }
}
