package com.cl.slack.builder;

/**
 * <p>Description: 通过Builder来构建产品对象,
 * 而Director封装了构建复杂产品对象对象的过程，不对外隐藏构建细节
 * Android源码中，最常用到的是AlertDialog.Builder </p>
 * Created by slack on 2016/8/19 13:50 .
 */
public class Test {

    public static void main(String[] args) {
        // 构建器
        Builder builder = new ApplePCBuilder();
        // Director
        Director pcDirector = new Director(builder);
        // 封装构建过程, 4核, 内存2GB, Mac系统
        pcDirector.construct(4, 2, "Mac OS X 10.9.1");
        // 构建电脑, 输出相关信息
        System.out.println("Computer Info : " + builder.create().toString());
    }
}
