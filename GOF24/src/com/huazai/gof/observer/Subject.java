package com.huazai.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    /**
     * 观察者集合
     */
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        System.out.println("当前十进制数据为：" + state);
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
