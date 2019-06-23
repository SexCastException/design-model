package com.huazai.gof.builder;

import com.huazai.gof.builder.bean.AirShip;

/**
 * 组装者
 */
public interface IAirShipDirector {
    /**
     * 组装飞船
     *
     * @return
     */
    AirShip assembleShip();
}
