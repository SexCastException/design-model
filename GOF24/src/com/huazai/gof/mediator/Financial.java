package com.huazai.gof.mediator;

/**
 * 财务部
 */
public class Financial implements Department {
    private Mediator mediator;

    public Financial(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("计算公司财务盈亏");
    }


    @Override
    public void outAction() {
        System.out.println("向其他部门资金输出");
        // 通过总经理这个中介者向其他部门发布命令，解耦了各个部门之间的交互
        mediator.command("development");
        mediator.command("market");
    }
}
