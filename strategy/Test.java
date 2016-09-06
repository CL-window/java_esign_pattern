package com.cl.slack.strategy;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 14:21 .
 */
public class Test {

    public static void main(String[] args){
        double paramA = 5;
        double paramB = 21;

        System.out.println("加法结果是：" + calc(new AddStrategy(), paramA, paramB));
        System.out.println("减法结果是：" + calc(new SubStrategy(), paramA, paramB));
        System.out.println("乘法结果是：" + calc(new MultiStrategy(), paramA, paramB));
        System.out.println("除法结果是：" + calc(new DivStrategy(), paramA, paramB));
    }

    //执行方法
    public static double calc(Strategy strategy, double paramA, double paramB) {
        Calc calc = new Calc();
        calc.setStrategy(strategy);
        return calc.calc(paramA, paramB);
    }

    // 未使用策略模式
    public static double calc(String op, double paramA, double paramB) {
        if ("+".equals(op)) {
            System.out.println("执行加法...");
            return paramA + paramB;
        } else if ("-".equals(op)) {
            System.out.println("执行减法...");
            return paramA - paramB;
        } else if ("*".equals(op)) {
            System.out.println("执行乘法...");
            return paramA * paramB;
        } else if ("/".equals(op)) {
            System.out.println("执行除法...");
            if (paramB == 0) {
                throw new IllegalArgumentException("除数不能为0!");
            }
            return paramA / paramB;
        } else {
            throw new IllegalArgumentException("未找到计算方法!");
        }
    }
}
