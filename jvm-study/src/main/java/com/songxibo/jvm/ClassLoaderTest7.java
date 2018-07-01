package com.songxibo.jvm;

/**
 * 打印类加载的类加载器，使用根类加载器加载的类，在某些情况下获取ClassLoader会返回null
 *
 * @author songxibo
 * @date 2018/7/1下午12:40
 */
public class ClassLoaderTest7 {

    public static void main(String[] args) throws Exception{

        // null
        Class clazz =  Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        // sun.misc.Launcher$AppClassLoader@135fbaa4
        Class clazz2 = Class.forName("com.songxibo.jvm.C");
        System.out.println(clazz2.getClassLoader());

    }

}


class C {

}