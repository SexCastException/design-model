package com.huazai.gof.state;

/**
 * 空闲状态
 */
public class FreeSate implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲");
    }
}
