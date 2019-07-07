package com.huazai.gof.strategy;

/**
 * 新用户批量购买
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double originPrice) {
        System.out.println("新用户批量购买，打9折销售");
        return originPrice * 0.9;
    }
}
