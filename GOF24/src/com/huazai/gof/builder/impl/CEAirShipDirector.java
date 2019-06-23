package com.huazai.gof.builder.impl;

import com.huazai.gof.builder.IAirShipBuilder;
import com.huazai.gof.builder.IAirShipDirector;
import com.huazai.gof.builder.bean.AirShip;
import com.huazai.gof.builder.bean.Engine;
import com.huazai.gof.builder.bean.EscapeTower;
import com.huazai.gof.builder.bean.OrbitalModule;

public class CEAirShipDirector implements IAirShipDirector {
    private IAirShipBuilder builder;

    public CEAirShipDirector(IAirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip assembleShip() {
        Engine engine = builder.buildEngine();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        EscapeTower escapeTower = builder.buildEscapeTower();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
