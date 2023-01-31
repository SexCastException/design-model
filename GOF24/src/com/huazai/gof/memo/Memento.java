package com.huazai.gof.memo;

/**
 * 备忘录类：负责存储 {@link Originator}对象的内部状态，并可以防止{@link Originator}以外的其他对象访问备忘录。备忘录有两个接口：{@link CareTaker}只能看到备忘录的窄接口，
 * 他只能将备忘录传递给其他对象。{@link Originator}却可看到备忘录的宽接口，允许它访问返回到先前状态所需要的所有数据。
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
