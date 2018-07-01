package com.songxibo.jvm;

import java.util.Random;

/**
 * 接口初始化
 *
 * 加载接口和加载类相同，它只会加载常量拥有那个类, 不会像类一样先去加载父类
 * 因为它不会被放置到常量池中，如果加载的是静态变量那么子类只会自己加载不会加载父类
 *
 * @author songxibo
 * @date 2018/6/27下午11:32
 */
public class ClassLoaderTest5 {

    public static void main(String[] args) {

        System.out.println(MyInterface2.a);

    }

}

interface MyInterface1 {

    /**
     * 默认都是public static final 这里只是为了强调是常量
     */
    public static final int a = new Random().nextInt();

}

interface MyInterface2 extends MyInterface1{

    public static final int b = 1;

}
