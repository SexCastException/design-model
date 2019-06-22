package com.huazai.gof.factory.abstractfactory.impl;

import com.huazai.gof.factory.abstractfactory.Tyre;

public class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("耐磨");
    }
}
