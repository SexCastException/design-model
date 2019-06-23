package com.huazai.gof.builder;

import com.huazai.gof.builder.bean.AirShip;
import com.huazai.gof.builder.impl.CEAirShipBuilder;
import com.huazai.gof.builder.impl.CEAirShipDirector;

public class Test {
    @org.junit.Test
    public void test() {
        IAirShipDirector director = new CEAirShipDirector(new CEAirShipBuilder());
        AirShip airShip = director.assembleShip();
        System.out.println(airShip);
    }
}
