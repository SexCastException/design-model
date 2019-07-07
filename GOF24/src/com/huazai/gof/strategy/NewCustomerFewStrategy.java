package com.huazai.gof.strategy;

/**
 * 新用户少量购买
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double originPrice) {
        System.out.println("新用户少量购买，不打折，原价销售");
        return originPrice;
    }
}
