package com.huazai.gof.mediator;

/**
 * 市场部
 */
public class Market implements Department {
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持");
        mediator.command("financial");
    }


    @Override
    public void outAction() {
        System.out.println("接了1000万项目，财务记录在案，需要xxx技术，和科研部技术评审");
        // 通过总经理这个中介者向其他部门发布命令，解耦了各个部门之间的交互
        mediator.command("financial");
        mediator.command("development");
    }
}
