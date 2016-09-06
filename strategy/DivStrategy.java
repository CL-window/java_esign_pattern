package com.cl.slack.strategy;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 14:24 .
 */
public class DivStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("执行除法策略...");
        if (paramB == 0) {
            throw new IllegalArgumentException("除数不能为0!");
        }
        return paramA / paramB;
    }
}
