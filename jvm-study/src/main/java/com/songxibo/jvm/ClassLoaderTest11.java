package com.songxibo.jvm;

/**
 * 获取类加载器的几种方式
 *
 *
 * @author songxibo
 * @date 2018/7/2下午10:01
 */
public class ClassLoaderTest11 {

    public static void main(String[] args) {

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader classLoader = ClassLoaderTest11.class.getClassLoader();
        System.out.println(classLoader);

        // DriverManager.getCallerClassLoader() 未找到

    }

}
