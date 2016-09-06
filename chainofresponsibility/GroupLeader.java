package com.cl.slack.chainofresponsibility;

/**
 * <p>Description: 小组长类 </p>
 * Created by slack on 2016/8/19 16:01 .
 */
public class GroupLeader extends Leader {

    public GroupLeader() {
        super(1000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("GroupLeader: Of course Yes!");
    }
}
