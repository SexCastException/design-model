package com.huazai.gof.adapter;

public interface SDCard {
    /**
     * 读取sd卡
     */
    String readSD();

    /**
     * 向SD卡写内容
     */
    int writeSD(String msg);
}
