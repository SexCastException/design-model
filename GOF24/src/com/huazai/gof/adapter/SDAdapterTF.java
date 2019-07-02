package com.huazai.gof.adapter;

public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public TFCard getTfCard() {
        return tfCard;
    }

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        if (tfCard == null) {
            return "read content from SD Card";
        }
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        if (tfCard == null) {
            System.out.println("write message '" + msg + "' to SD Card");
            return 1;
        }
        return tfCard.writeTF(msg);
    }
}
