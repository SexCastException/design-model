package com.huazai.gof.adapter;

public class RWDataCard implements SDCard {
    private SDAdapterTF sdAdapterTF;

    public RWDataCard(SDAdapterTF sdAdapterTF) {
        this.sdAdapterTF = sdAdapterTF;
    }

    public SDAdapterTF getSdAdapterTF() {
        return sdAdapterTF;
    }

    public void setSdAdapterTF(SDAdapterTF sdAdapterTF) {
        this.sdAdapterTF = sdAdapterTF;
    }

    @Override
    public String readSD() {
        return sdAdapterTF.readSD();
    }

    @Override
    public int writeSD(String msg) {
        return sdAdapterTF.writeSD(msg);
    }
}
