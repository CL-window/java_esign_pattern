package com.cl.slack.chainofresponsibility;

/**
 * <p>Description: 责任链 Chain of Responsibility </p>
 * Created by slack on 2016/8/19 15:44 .
 */
public class Test {
    public static void main(String[] args) {
        /*
         * 先来一个程序猿 这里给他一个三万以内的随机值表示需要申请的差旅费
         */
        ProgramApes ape = new AndroidApe((int) (Math.random() * 30000));

        /*
         * 再来四个老大
         */
        Leader leader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        Leader boss = new Boss();

        /*
         * 设置老大的上一个老大
         */
        leader.setLeader(director);
        director.setLeader(manager);
        manager.setLeader(boss);

        // 处理申请
        leader.handleRequest(ape);
    }
}
