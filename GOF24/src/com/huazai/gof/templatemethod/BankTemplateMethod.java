package com.huazai.gof.templatemethod;

/**
 * 模板方法（template method）模式是编程中经常用到的模式。他定义了一个操作中的算法骨架，将某些步骤延迟到子类中实现。
 * 这样，新的子类可以在不改变一个算法结构的前提下重新定义该算法的某些特定步骤。完全有父类控制整个流程。
 * <p>
 * 核心：处理某个流程的代码都已经准备好，但是其中某个节点的代码暂时不能确定。因此，我们采用工厂方法模式，将这个节点的代码实现转移给子类完成。
 * 即：具体实现延迟到子类中定义
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分");
    }

    /**
     * 业务流程：
     * 1、取号排队
     * 2、银行业务办理(具体什么业务子类中实现)
     * 3、反馈评分
     */
    public final void process() {
        this.takeNumber();
        // 抽象方法，需要子类实现
        this.transact();
        this.evaluate();
    }
}
