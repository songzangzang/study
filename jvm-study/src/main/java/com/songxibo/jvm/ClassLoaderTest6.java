package com.songxibo.jvm;

/**
 * 类加载顺序
 *
 * 类初始化的时候会按照静态变量的顺序，从上至下进行加载，
 * 这个例子中b并不是没有被赋值，而是在准备阶段被赋值成为1，但在初始化时又被指定成了0
 *
 * @author songxibo
 * @date 2018/6/27下午11:44
 */
public class ClassLoaderTest6 {

    public static int a;


    private static ClassLoaderTest6 classLoaderTest6 = new ClassLoaderTest6();

    private ClassLoaderTest6 () {

        a += 1;
        b += 1;

    }

    public static int b = 0;

    public static ClassLoaderTest6 getInstance () {

        return classLoaderTest6;

    }

}

class MyClassLoaderTest6Client {

    public static void main(String[] args) {

        System.out.println(ClassLoaderTest6.a);

        System.out.println(ClassLoaderTest6.b);

    }

}
