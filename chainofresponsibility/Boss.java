package com.cl.slack.chainofresponsibility;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 16:03 .
 */
public class Boss extends Leader {
    public Boss() {
        super(40000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("Boss: Of course Yes!");
    }
}
