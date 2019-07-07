package com.huazai.gof.strategy;

/**
 * 老用户少量购买
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double originPrice) {
        System.out.println("老用户少量购买，打95折销售");
        return originPrice * 0.95;
    }
}
