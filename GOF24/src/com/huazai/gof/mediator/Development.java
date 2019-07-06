package com.huazai.gof.mediator;

/**
 * 科研部
 */
public class Development implements Department {
    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目");
    }


    @Override
    public void outAction() {
        System.out.println("汇报工作，没钱了，需要资金支持");
        mediator.command("financial");
        mediator.command("market");
    }
}
