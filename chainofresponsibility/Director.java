package com.cl.slack.chainofresponsibility;

/**
 * <p>Description: 项目主管类 </p>
 * Created by slack on 2016/8/19 16:02 .
 */
public class Director extends Leader{
    public Director() {
        super(5000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("Director: Of course Yes!");
    }
}
