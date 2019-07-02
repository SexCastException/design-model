package com.huazai.gof.adapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String s = "read content from TF Card";
        return s;
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("write msg '" + msg + "' to TFCard");
        return 1;
    }
}
