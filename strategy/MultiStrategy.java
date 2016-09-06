package com.cl.slack.strategy;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 14:24 .
 */
public class MultiStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("执行乘法策略...");
        return paramA * paramB;
    }
}
