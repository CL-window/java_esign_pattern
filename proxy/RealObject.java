package com.cl.slack.proxy;

/**
 * <p>Description: 目标对象 </p>
 * Created by slack on 2016/8/19 15:15 .
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}
