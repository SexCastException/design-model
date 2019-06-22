package com.huazai.gof.factory.abstractfactory.impl;

import com.huazai.gof.factory.abstractfactory.Tyre;

public class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("不耐磨");
    }
}
