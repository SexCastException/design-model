package com.huazai.gof.adapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String s = "read content from SD Card";
        System.out.println(s);
        return s;
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("write message '" + msg + "' to SD Card");
        return 1;
    }
}
