package com.songxibo.jvm;

/**
 * 获取Java虚拟机内置加载器的加载路径
 *
 *
 * @author songxibo
 * @date 2018/7/1512:37
 */
public class ClassLoaderTest15 {

    public static void main(String[] args) throws Exception{

        // 根类加载器加载器路径 /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/rt.jar
        System.out.println(System.getProperty("sun.boot.library.path"));

        System.out.println("-");
        // 拓展类加载器加载路径
        System.out.println(System.getProperty("java.ext.dirs"));

        System.out.println("-");
        // 系统类加载器加载路径
        System.out.println(System.getProperty("java.class.path"));

    }

}
