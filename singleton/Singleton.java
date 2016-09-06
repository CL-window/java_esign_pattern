package com.cl.slack.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: 核心原理都是将构造函数私有化，
 * 并且通过静态方法获取一个唯一的实例 </p>
 * Created by slack on 2016/8/19 14:51 .
 */
public class Singleton {
    // 私有化构造函数
    private Singleton() {}

    /**
     * 方式一 静态变量
     */
    private static final Singleton mSingleton1 = new Singleton();

    public static Singleton mSingleton1() {
        return mSingleton1;
    }

    private static Singleton mSingleton2 = null;


    /**
     * 方式二 double-check， 避免并发时创建了多个实例,
     * 该方式不能完全避免并发带来的破坏.
     *
     * @return
     */
    public static Singleton mSingleton2() {
        if (mSingleton2 == null) {
            synchronized (Singleton.class) {
                if (mSingleton2 == null) {
                    mSingleton2 = new Singleton();
                }
            }
        }
        return mSingleton2;
    }

    /**
     * 方式三  在第一次加载SingletonHolder时初始化一次singleton3对象,
     * 保证唯一性, 也延迟了单例的实例化,
     * 如果该单例比较耗资源可以使用这种模式.
     *
     * @return
     */
    public static Singleton Singleton3() {
        return SingletonHolder.singleton3;
    }
    /**
     * 静态内部类
     *
     * @author mrsimple
     *
     */
    private static class SingletonHolder {
        private static final Singleton singleton3 = new Singleton();
    }

    /**
     *  方式四 : 枚举单例, 线程安全
     * @author mrsimple
     *  use : Singleton4.INSTANCE
     */
    enum Singleton4 {
        INSTANCE;
        public void doSomething() {
            System.out.println("do sth.");
        }
    }

    /**
     * 方式五  注册到容器, 根据key获取对象.一般都会有多种相同属性类型的对象会注册到一个map中
     * instance容器
     */
    private static Map<String ,Singleton> objMap = new HashMap<>();
    /**
     * 注册对象到map中
     * @param key
     * @param instance
     */
    public static void registerSingleton5(String key, Singleton instance) {
        if (!objMap.containsKey(key) ) {
            objMap.put(key, instance) ;
        }
    }
    /**
     * 根据key获取对象
     * @param key
     * @return
     */
    public static Singleton getSingleton5(String key) {
        return objMap.get(key) ;
    }



    public void doSomething() {
        System.out.println("do sth...");
    }
}
