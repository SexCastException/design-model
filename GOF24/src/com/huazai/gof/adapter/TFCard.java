package com.huazai.gof.adapter;

public interface TFCard {
    /**
     * 读取TF卡
     */
    String readTF();

    /**
     * 向TF卡写内容
     */
    int writeTF(String msg);
}
