package com.cl.slack.builder;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:49 .
 */
public class ApplePCBuilder  extends Builder {
    private Computer mApplePc = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePc.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePc.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setOs(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }
}
