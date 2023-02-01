package com.huazai.gof.advanced.proxy.one;

/**
 * @author pyh
 * @date 2020/2/19 18:01
 */
public class Tank implements Moveable{
    @Override
    public void move() {
        System.out.println("tank moving.....");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
