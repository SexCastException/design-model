package com.huazai.gof.factory.abstractfactory.impl;

import com.huazai.gof.factory.abstractfactory.Seat;

public class LuxurySeat implements Seat {
    @Override
    public void experience() {
        System.out.println("坐着舒服");
    }
}
