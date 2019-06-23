package com.huazai.gof.builder;

import com.huazai.gof.builder.bean.Engine;
import com.huazai.gof.builder.bean.EscapeTower;
import com.huazai.gof.builder.bean.OrbitalModule;

/**
 * 飞船建造者
 * 建造者模式：分离了对象子组件，单独构造（Builder）和装配（Director），从而可以构造出复杂的对象。适用于某个复杂对象的构造。
 * 实现了构造和装配的解耦。不同的构造，相同的装配，可以创建出不同的对象；相同的构造，不同的装配顺序也可以构造出不同的对象。实现了构建算法、装配算法的解耦，实现了更好的复用。
 */
public interface IAirShipBuilder {

    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
