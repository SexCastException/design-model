package com.huazai.gof.adapter;

public class Test {
    @org.junit.Test
    public void test() {
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        RWDataCard rwDataCard = new RWDataCard(sdAdapterTF);

        Computer computer = new HUAWEIComputer(rwDataCard);
        computer.readSD();
        computer.writeSD();
    }
}
