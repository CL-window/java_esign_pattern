package com.cl.slack.facade;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:27 .
 */
public interface Controller {

    void powerOn();// 电源

    void powerOff();

    void turnUp();// 音量

    void turnDown();

    void nextChannel();// 频道

    void prevChannel();

}
