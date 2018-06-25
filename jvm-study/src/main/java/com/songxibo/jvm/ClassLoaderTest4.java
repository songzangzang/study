package com.songxibo.jvm;

/**
 *
 * 数组实例是由JVM在运行期间动态生成的，表示为[Lcom.songxibo.jvm.MyParent4;@2503dbd3
 * 这种形式，其父类是Object
 *
 * 助记符
 * anewarray: 表示一个引用类型(类、接口)数组，并将其压入栈顶
 * newarray: 表示一个原生类型数据，并将其压入栈顶
 *
 * @author songxibo
 * @date 2018/6/25下午9:41
 */
public class ClassLoaderTest4 {

    public static void main(String[] args) {

        MyParent4 myParent4 = new MyParent4();

        MyParent4[] parent4s = new MyParent4[5];
        System.out.println(parent4s);

        int[] ints = new int[1];
        System.out.println(ints);

    }

}

class MyParent4 {

    static{

        System.out.println("MyParent4 block print");

    }

}
