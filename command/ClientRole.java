package com.cl.slack.command;

/**
 * <p>Description: 命令对象和接受者对象的组装类 </p>
 * Created by slack on 2016/8/19 16:26 .
 */
public class ClientRole {
    /**
     * 组装操作
     */
    public void assembleAction() {
        //创建一个命令接收者
        ReceiverRole receiverRole1 = new ReceiverRole();
        //创建一个命令的具体实现对象，并指定命令接收者
        Command command1 = new ConcreteCommandImpl1(receiverRole1);
        Command command2 = new ConcreteCommandImpl2(receiverRole1);

        InvokerRole invokerRole = new InvokerRole();//创建一个命令调用者
        invokerRole.setCommand1(command1);//为调用者指定命令对象1
        invokerRole.setCommand2(command2);//为调用者指定命令对象2
        invokerRole.invoke(0);              //发起调用命令请求
        invokerRole.invoke(1);              //发起调用命令请求
    }
}
