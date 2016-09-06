package com.cl.slack.prototype;

import com.cl.slack.mould.AbstractComputer;
import com.cl.slack.mould.CoderComputer;
import com.cl.slack.mould.MilitaryComputer;

/**
 * <p>Description: WordDocument的在该原型模式示例中扮演的角色为ConcretePrototype，
 * 而Cloneable的角色则为Prototype
 * doc2是通过originDoc.clone()创建的，并且doc2第一次输出的时候和originDoc输出是一样的。
 * 即doc2是originDoc的一份拷贝，他们的内容是一样的，
 * 而doc2修改了文本内容以后并不会影响originDoc的文本内容。
 * 需要注意的是通过clone 拷贝对象 浅拷贝  的时候并不会执行构造函数 </p>
 * Created by slack on 2016/8/19 13:52 .
 */
public class Test {
    public static void main(String[] args) {
        WordDocument originDoc = new WordDocument();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();

        doc2.setText("这是修改过的Doc2文本");
        doc2.showDocument();

        originDoc.showDocument();
    }
}
