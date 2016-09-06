package com.cl.slack.chainofresponsibility;

/**
 * <p>Description: 部门经理类 </p>
 * Created by slack on 2016/8/19 16:02 .
 */
public class Manager extends Leader {
    public Manager() {
        super(10000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("Manager: Of course Yes!");
    }
}
