package com.huazai.gof.command;

/**
 * ConcreteCommand：具体命令抽象类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 命令执行前或者后进行相关的处理
        receiver.action();
    }
}
