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
        mediator.command("development");
        mediator.command("market");
    }
}
