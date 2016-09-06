package com.cl.slack.strategy;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 14:25 .
 */
public class Calc {

    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calc(double paramA, double paramB) {
        // doing something
        if (this.strategy == null) {
            throw new IllegalStateException("你还没有设置计算的策略");
        }
        return this.strategy.calc(paramA, paramB);
    }

}
