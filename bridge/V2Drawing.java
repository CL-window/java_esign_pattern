package com.cl.slack.bridge;

/**
 * <p>Description: V2Drawing控制着DP2程序进行绘图 </p>
 * Created by slack on 2016/8/19 17:02 .
 */
public class V2Drawing implements Drawing{
    DP2 dp2;

    public V2Drawing() {
        dp2 = new DP2();
    }

    @Override
    public void drawRantangle() {
        dp2.drawRantanle();
    }
    @Override
    public void drawCircle() {
        dp2.drawCircle();
    }
}
