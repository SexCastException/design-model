package com.huazai.gof.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者:负责备忘录 {@link Memento}，不能对{@link Memento}的内容进行访问或者操作。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
