package com.huazai.gof.mediator;

/**
 * 同事类的接口，中介者和同事类相互持有使用的对象
 */
public interface Department {
    void selfAction();

    void outAction();
}
