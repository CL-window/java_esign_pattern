package com.cl.slack.command;

/**
 * <p>Description:  命令接口 </p>
 * Created by slack on 2016/8/19 16:16 .
 */
public interface Command {
    void execute();
    void undo();
    void redo();
}
