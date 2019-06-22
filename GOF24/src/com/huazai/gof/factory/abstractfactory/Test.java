package com.huazai.gof.factory.abstractfactory;

import com.huazai.gof.factory.abstractfactory.impl.LowCarFactory;
import com.huazai.gof.factory.abstractfactory.impl.LuxuryCarFactory;

public class Test {
    @org.junit.Test
    public void test() {
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        CarFactory lowCarFactory = new LowCarFactory();

        luxuryCarFactory.createEngine().run();
        lowCarFactory.createEngine().run();

        luxuryCarFactory.createSeat().experience();
        lowCarFactory.createSeat().experience();

        luxuryCarFactory.createTyre().revolve();
        lowCarFactory.createTyre().revolve();
    }
}
