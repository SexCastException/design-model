package com.huazai.gof.bridge;

public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public abstract void sale();
}

/**
 * 台式电脑
 */
class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售台式电脑");
    }
}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售笔记本电脑");
    }
}

class IPad extends Computer {
    public IPad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售平板电脑");
    }
}
