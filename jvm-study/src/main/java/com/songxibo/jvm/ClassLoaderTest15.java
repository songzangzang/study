package com.songxibo.jvm;

/**
 * 获取Java虚拟机内置加载器的加载路径
 *
 * 父类委托模型的好处
 * 1. 保证Java核心类是同一个加载器进行加载的，比如java.lang.Object都是由同一个加载器加载的，
 * 这样就不会出现互相影响的情况，因为Object是所有类的父类，如果还都不一样会存在很大的问题
 * 2. 保证的Java核心类的安全性，不会出现被替换掉的情况
 * 3. 自定义加载器之间只要没有父类委托的关系，可以加载出一样包名的相同名称的类，
 * 有很多技术会应用到这种情况
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
