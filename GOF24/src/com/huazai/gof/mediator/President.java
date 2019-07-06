package com.huazai.gof.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 */
public class President implements Mediator {
    private Map<String, Department> map = new HashMap();

    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }
}
