package com.huazai.gof.state;

/**
 * 已预订状态
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已被预订，预订失败");
    }
}
