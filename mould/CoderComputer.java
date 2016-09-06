package com.cl.slack.mould;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:53 .
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("码农只需要进行用户和密码验证就可以了");
    }
}
