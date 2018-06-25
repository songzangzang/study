package com.songxibo.jvm;

import java.util.UUID;

/**
 * 常量UUID测试
 *
 * 如果一个常量在编译期间不能确定其值，那么就不会放入到常量池中。
 * 在程序运行时会主动使用这个常量所在的类，所以会被初始化
 *
 * @author songxibo
 * @date 2018/6/25下午9:17
 */
public class ClassLoaderTest3 {

    public static void main(String[] args) {

        System.out.println(MyParent3.id);

    }


}

class MyParent3 {

    public static final String id = UUID.randomUUID().toString();

    static{

        System.out.println("MyParent3 block print");

    }

}
