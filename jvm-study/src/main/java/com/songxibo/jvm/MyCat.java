package com.songxibo.jvm;

/**
 * ClassLoader14测试类
 *
 * @author songxibo
 * @date 2018/7/1500:12
 */
public class MyCat {

    public MyCat() {

        System.out.println("MyCat init print classLoader:" + this.getClass().getClassLoader());

        new MySample();

//        System.out.println(MySample.class);

    }

}
