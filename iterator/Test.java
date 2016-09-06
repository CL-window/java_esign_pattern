package com.cl.slack.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Description: java Iterator
 * 不暴露集合的内部结构，又可让外部代码透明的访问集合内部的数据</p>
 * Created by slack on 2016/8/19 15:34 .
 */
public class Test {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
