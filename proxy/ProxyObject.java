package com.cl.slack.proxy;

/**
 * <p>Description: 代理对象 </p>
 * Created by slack on 2016/8/19 15:15 .
 */
public class ProxyObject extends AbstractObject{
    RealObject realObject = new RealObject();
    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
