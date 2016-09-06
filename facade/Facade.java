package com.cl.slack.facade;

/**
 * <p>Description: 外观模式
 * 封装了子系统的操作，并且暴露接口让用户使用
 * Android源码中，Context  startActivity()、sendBroadcast()等</p>
 * Created by slack on 2016/8/19 13:25 .
 */
public class Facade {
    public static void main(String[] args) {
        Controller controller = new TVController();
        controller.powerOn();
        controller.turnUp();
        controller.turnDown();
        controller.nextChannel();
        controller.prevChannel();
        controller.powerOff();
    }
}
