package com.huazai.gof.state;

public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(100);
        System.out.println("current state class：" + gumballMachine.getState());
        // 投币
        gumballMachine.insertQuarter();
        System.out.println("current state class：" + gumballMachine.getState());
        // 转动出糖曲轴
        gumballMachine.turnCrank();
        System.out.println("current state class：" + gumballMachine.getState());
        // 出糖
        gumballMachine.dispense();
        System.out.println("current state class：" + gumballMachine.getState());

        // 在没投币的时候调用出糖果
        gumballMachine.dispense();

    }
}
