package com.cl.slack.bridge;

/**
 * <p>Description:V1Drawing控制着DP1程序进行绘图  </p>
 * Created by slack on 2016/8/19 17:02 .
 */
public class V1Drawing implements Drawing{

    DP1 dp1;

    public V1Drawing() {
        dp1 = new DP1();
    }
    @Override
    public void drawRantangle() {
        dp1.draw_1_Rantanle();
    }
    @Override
    public void drawCircle() {
        dp1.draw_1_Circle();
    }
}
