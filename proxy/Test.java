package com.cl.slack.proxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Description: java的反射机制 </p>
 * Created by slack on 2016/8/19 15:16 .
 */
public class Test {
    public static void main(String[] args){
        AbstractObject obj = new ProxyObject();
        obj.operation();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
    }
}
