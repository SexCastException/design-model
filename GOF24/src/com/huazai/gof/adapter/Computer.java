package com.huazai.gof.adapter;

public interface Computer {
    /**
     * 计算机读取SD卡，SD卡是计算机默认支持的功能，如果要读取TF卡就得通过适配器
     *
     * @param
     * @return
     */
    String readSD();

    int writeSD();
}
