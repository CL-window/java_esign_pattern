package com.cl.slack.mould;

/**
 * <p>Description:  在startUp方法中有一些固定的步骤，
 * 依次为开启电源、检查硬件、加载系统、用户登录四个步骤，
 * 这四个步骤是电脑开机过程中不会变动的四个过程。
 * 但是不同用户的这几个步骤的实现可能各不相同，因此他们可以用不同的实现。
 * 而startUp为final方法，即保证了算法框架不能修改，
 * 具体算法实现却可以灵活改变。
 * startUp中的这几个算法步骤我们可以称为是一个套路，
 * 即可称为模板方法</p>
 * 在Android中，一个典型 AsyncTask
 * execute方法内部封装了onPreExecute, doInBackground, onPostExecute这个算法框架，
 * 用户可以根据自己的需求来在覆写这几个方法
 * Created by slack on 2016/8/19 13:52 .
 */
public class Test {
    public static void main(String[] args) {
        AbstractComputer comp = new CoderComputer();
        comp.startUp();

        comp = new MilitaryComputer();
        comp.startUp();
    }
}
