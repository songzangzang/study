package com.songxibo.jvm;

/**
 * 复习前面学习的主动使用 1
 *
 * @author songxibo
 * @date 2018/7/2上午6:45
 */
public class ClassLoaderTest8 {

    public static void main(String[] args) {
        // 因为是常量，常量会把值赋值到调用静态方法所在的类里，所以不会初始化Child
        System.out.println(Child.a);

    }

}

class Parent {

    public final static int a = 1;

    static {
        System.out.println("Parent static block");
    }

}

class Child extends Parent {

    public final static int b = 2;

    static {
        System.out.println("Child static block");
    }

}
