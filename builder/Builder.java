package com.cl.slack.builder;

/**
 * <p>Description:  </p>
 * Created by slack on 2016/8/19 13:48 .
 */
public abstract class Builder {
    // 设置CPU核心数
    public abstract void buildCPU(int core);

    // 设置内存
    public abstract void buildRAM(int gb);

    // 设置操作系统
    public abstract void buildOs(String os);

    // 创建Computer
    public abstract Computer create();
}
