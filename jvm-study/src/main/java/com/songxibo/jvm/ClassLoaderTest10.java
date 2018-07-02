package com.songxibo.jvm;

/**
 * 使用反射加载类
 *
 * @author songxibo
 * @date 2018/7/2下午8:21
 */
public class ClassLoaderTest10 {

    public static void main(String[] args) throws Exception{

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = classLoader.loadClass("com.songxibo.jvm.D");

        System.out.println(aClass);

        System.out.println("----");

        Class clazz = Class.forName("com.songxibo.jvm.D");
        System.out.println(clazz);

    }

}

class D {

    static {
        System.out.println("D static block");
    }

}
