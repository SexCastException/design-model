package com.huazai.gof.factory.abstractfactory.impl;

import com.huazai.gof.factory.abstractfactory.CarFactory;
import com.huazai.gof.factory.abstractfactory.Engine;
import com.huazai.gof.factory.abstractfactory.Seat;
import com.huazai.gof.factory.abstractfactory.Tyre;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
