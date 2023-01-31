package com.huazai.gof.memo.advanced;

/**
 * 管理者类
 */
public class CareTaker {
    RoleMemento memento;

    public RoleMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleMemento memento) {
        this.memento = memento;
    }
}
