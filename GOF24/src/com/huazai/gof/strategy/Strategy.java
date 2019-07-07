package com.huazai.gof.strategy;

/**
 * 策略模式对应于解决某一个问题的一个算法族，允许用户从该算法族总任选一个算法来解决问题，同时可以方便的更换算法或者新增算法。
 */
public interface Strategy {
    /**
     * 根据不同的用户计算价格
     *
     * @param originPrice
     * @return
     */
    double getPrice(double originPrice);
}
