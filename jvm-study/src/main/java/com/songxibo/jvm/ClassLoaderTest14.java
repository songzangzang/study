package com.songxibo.jvm;

/**
 * 类加载器在某些情况会进行预加载操作，
 * 但是这个例子不会进行预加载TraceClassLoader可以清楚看到每一个加载过程
 *
 * 后面加载MyCat的时候也输出的MySample是因为在MyCat的初始构造器中
 * 主动使用了MySample
 *
 * @author songxibo
 * @date 2018/7/1500:07
 */
public class ClassLoaderTest14 {

    public static void main(String[] args) throws Exception{

        MyClassLoader myClassLoader = new MyClassLoader("myClassLoader");
        myClassLoader.setPath("/Users/kaeraier/Desktop/");
        Class<?> clazz = myClassLoader.loadClass("com.songxibo.jvm.MyCat");

        System.out.println(clazz.hashCode());
        System.out.println(clazz.newInstance());
        System.out.println(clazz.getClassLoader());

    }

}
