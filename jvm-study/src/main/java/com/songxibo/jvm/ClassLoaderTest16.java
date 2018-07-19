package com.songxibo.jvm;

import java.lang.reflect.Method;

/**
 * 1. 测试两个加载器加载一个类是否相同
 * 比较交过会输出相同，因为他们都会委托父类加载器进行加载
 * 2. 使用反射注入第二个类到第一个类中是否会报错
 * 不会报错，因为他们对象不同不会出现问题
 *
 * 注意：不同命名空间创建出来的类如果没有子类父类的关系，那么他们创建的对象是不可见的
 *
 *
 * @author songxibo
 * @date 2018/7/1513:04
 */
public class ClassLoaderTest16 {

    public static void main(String[] args) throws Exception{

        MyClassLoader myClassLoader1 = new MyClassLoader("classLoader1");
        myClassLoader1.loadClass("com.songxibo.jvm.MyDuplicate");
        Class<?> clazz1 = myClassLoader1.loadClass("com.songxibo.jvm.MyDuplicate");

        MyClassLoader myClassLoader2 = new MyClassLoader("classLoader2");
        myClassLoader2.loadClass("com.songxibo.jvm.MyDuplicate");
        Class<?> clazz2 = myClassLoader2.loadClass("com.songxibo.jvm.MyDuplicate");

        System.out.println(clazz1 == clazz2);

        Method method = clazz1.getMethod("setMyDuplicate", Object.class);
        method.invoke(clazz1.newInstance(), clazz2.newInstance());

    }

}
