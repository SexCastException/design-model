package com.huazai.gof.builder.bean;

/**
 * 轨道舱
 */
public class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
