package com.huazai.gof.strategy;

/**
 * 老用户批量购买
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double originPrice) {
        System.out.println("老用户批量购买，打8折销售");
        return originPrice * 0.8;
    }
}
