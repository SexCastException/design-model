package com.huazai.gof.memo;

/**
 * 发起人类：负责创建一个备忘录 {@link Memento}，用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。{@link Originator}可以根据需要决定 {@link Memento}存储自己的哪些内部状态。
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    /**
     * 调用此方法可以保存自身当前状态数据
     *
     * @return
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象可以让自身恢复到指定状态
     *
     * @param Memento
     */
    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
