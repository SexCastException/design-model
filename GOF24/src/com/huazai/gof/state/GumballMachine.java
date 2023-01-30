package com.huazai.gof.state;

/**
 * 糖果售卖机
 * 一共有四种状态：没有硬币状态、投币状态、出售糖果状态、糖果售尽状态
 * 一共有四种行为：投币、转动出糖曲轴、发糖、退币
 * <p>
 * 四种行为对应四个方法，每一种行为在不同的状态都会有不同的逻辑，如果用传统面向过程的做法，每个方法都要写大量的if-else判断当前的状态然后执行相应的逻辑，
 * 如果增加了一种新状态，那所有的方法都要添加多一个判断分支。状态模式就是将每个方法中相同条件的分支的逻辑都抽取出来，封装到对应状态类中。
 *
 * 状态模式和策略模式的相同点就是在不同的场景下切换到不同的方案（多态），不同点是，策略模式的方案切换是显示手动切换的，而状态模式的方案（状态）切换是自动的，
 * 比如无币状态，投币之后自动切换为投币状态，退币之后自动切换为无币状态等。
 * 糖果机不需要关心状态的改变，只需要调用对应状态的相关方法即可，因为已经将传统if-else分支的逻辑代码委托到对应的状态类了。
 */
public class GumballMachine {
    public State noQuarterState = new NoQuarterState(this);
    public State hasQuarterState = new HasQuarterState(this);
    public State soldState = new SoldState(this);
    public State soldOutState = new SoldOutState(this);

    /**
     * 当前机器状态
     */
    private State state = soldOutState;
    private int candyCount = 0;

    public GumballMachine(int count) {
        this.candyCount = count;
        if (count > 0)
            setState(noQuarterState);
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCandyCount(int candyCount) {
        this.candyCount = candyCount;
    }

    public int getCandyCount() {
        return candyCount;
    }
}
