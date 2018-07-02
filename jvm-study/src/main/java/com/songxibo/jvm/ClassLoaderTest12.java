package com.songxibo.jvm;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * 使用类加载器进行初始化
 *
 *
 * @author songxibo
 * @date 2018/7/2下午10:04
 */
public class ClassLoaderTest12 {

    public static void main(String[] args) throws IOException {

        String path = "com/songxibo/jvm/ClassLoaderTest1.class";

        Enumeration<URL> urls = ClassLoader.getSystemResources(path);
        while (urls.hasMoreElements()) {
            System.out.println(urls.nextElement());
        }

        // 查看ClassLoaderTest12的类加载是什么
        System.out.println(ClassLoaderTest12.class.getClassLoader());

        // 查看String类加载器是什么，null代表是根类加载器，因为根类加载器加载的是rt.jar中的内容
        System.out.println(String.class.getClassLoader());

    }

}
