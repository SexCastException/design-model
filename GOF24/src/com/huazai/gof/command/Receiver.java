package com.huazai.gof.command;

/**
 * 真正命令的接收者
 * 接收者与执行请求相关的操作，具体实现对请求的业务处理。
 */
public class Receiver {
    public void action(){
        System.out.println("Receiver.action");
    }
}
