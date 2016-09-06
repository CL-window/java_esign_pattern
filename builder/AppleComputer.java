package com.cl.slack.builder;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:48 .
 */
public class AppleComputer extends Computer {

    protected AppleComputer() {

    }

    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }

}
