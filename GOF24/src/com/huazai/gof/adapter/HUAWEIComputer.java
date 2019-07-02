package com.huazai.gof.adapter;

public class HUAWEIComputer implements Computer {
    private SDCard sdCard;

    public HUAWEIComputer(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public String readSD() {
        return sdCard.readSD();
    }

    public int writeSD() {
        String msg = "hello world";
        return sdCard.writeSD(msg);
    }
}
