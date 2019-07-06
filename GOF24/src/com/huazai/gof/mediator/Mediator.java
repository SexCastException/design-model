package com.huazai.gof.mediator;

public interface Mediator {
    void register(String name, Department department);

    void command(String name);
}
