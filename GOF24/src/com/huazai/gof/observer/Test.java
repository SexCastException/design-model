package com.huazai.gof.observer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.setState(100);

    }
}
