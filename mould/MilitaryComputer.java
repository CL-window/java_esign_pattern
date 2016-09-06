package com.cl.slack.mould;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:54 .
 */
public class MilitaryComputer extends AbstractComputer {


    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹之别等复杂的用户验证");
    }
}
