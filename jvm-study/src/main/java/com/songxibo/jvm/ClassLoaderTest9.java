package com.songxibo.jvm;

/**
 * 复习前面学习的主动使用 2
 *
 * @author songxibo
 * @date 2018/7/2上午6:48
 */
public class ClassLoaderTest9 {

    public static void main(String[] args) {
        // 代表只对Parent1的主动使用
        System.out.println(Child1.a);
        System.out.println("------");
        new Parent1();
        System.out.println("------");
        // 因为父类已经被初始化过一次，所以不会在被初始化
        System.out.println(Child1.b);
    }

}

class Parent1 {

    public static int a = 1;

    static {
        System.out.println("Parent1 static block");
    }

}

class Child1 extends Parent1{

    public static int b = 2;

    static {
        System.out.println("Child static block");
    }

}
