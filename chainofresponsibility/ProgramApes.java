package com.cl.slack.chainofresponsibility;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 15:59 .
 */
public abstract class ProgramApes {
    /**
     * 获取程序员具体的差旅费用
     *
     * @return 要多少钱
     */
    public abstract int getExpenses();

    /**
     * 获取差旅费申请
     *
     * @return Just a request
     */
    public abstract String getApply();
}
