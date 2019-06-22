package com.huazai.gof.factory.abstractfactory.impl;

import com.huazai.gof.factory.abstractfactory.CarFactory;
import com.huazai.gof.factory.abstractfactory.Engine;
import com.huazai.gof.factory.abstractfactory.Seat;
import com.huazai.gof.factory.abstractfactory.Tyre;

public class MiddleCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
