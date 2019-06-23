package com.huazai.gof.builder.impl;

import com.huazai.gof.builder.IAirShipBuilder;
import com.huazai.gof.builder.bean.Engine;
import com.huazai.gof.builder.bean.EscapeTower;
import com.huazai.gof.builder.bean.OrbitalModule;

/**
 * 嫦娥飞船建造者
 */
public class CEAirShipBuilder implements IAirShipBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("华仔二手发动机");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("华仔盗版轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("华仔测试版逃离舱");
    }
}
