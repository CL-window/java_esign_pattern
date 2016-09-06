package com.cl.slack.facade;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:30 .
 */
public class TVController implements Controller {

    private PowerSystem mPowerSystem = new PowerSystem();
    private VoiceSystem mVoiceSystem = new VoiceSystem();
    private ChannelSystem mChannelSystem = new ChannelSystem();

    @Override
    public void powerOn() {
        mPowerSystem.powerOn();
    }

    @Override
    public void powerOff() {
        mPowerSystem.powerOff();
    }

    @Override
    public void turnUp() {
        mVoiceSystem.turnUp();
    }

    @Override
    public void turnDown() {
        mVoiceSystem.turnDown();
    }

    @Override
    public void nextChannel() {
        mChannelSystem.next();
    }

    @Override
    public void prevChannel() {
        mChannelSystem.prev();
    }
}
