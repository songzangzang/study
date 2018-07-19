package com.songxibo.jvm;

import sun.misc.Launcher;

/**
 * 类加载器命名空间：
 * 类加载器命名空间是由其二进制名称(binary name)和定义类加载器一起组成的，如果不是同一个加载器进行加载，就算包名类名或字节码文件相同，
 * 那它也会被类加载器加载出两份，并且它们之间不可见
 *
 *
 *
 * @author songxibo
 * @date 2018/7/1721:24
 */
public class ClassLoaderTest17 {

    public static void main(String[] args) {

        /*
            注意如果在命令行使用java命令执行，那么系统类加载器会显示., 因为这时已经脱离了IDE所在的环境
         */
        System.out.println(System.getProperty("sun.boot.library.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        /*
            Java类加载器是由谁加载器的？
            是由根类加载器进行加载器的，Java自定义类加载器只有根类加载器不是Java代码实现的
            其他都是由Java代码实现的，根类加载器会在运行的时候加载其余两个Java加载器，而且还会加载jre下的一些必要运行环境，
            比如加载java.util和java.lang下内的Class文件

            加载的类是Launcher，以下是验证的代码
         */

        // 证明加载系统类加载器的是根类加载器
        System.out.println(ClassLoader.class.getClassLoader());

        System.out.println(Launcher.class.getClassLoader());

        /*
            如果更改系统加载器，重新指定一个系统类加载器
            使用java.system.class.loader
         */
        System.out.println(ClassLoader.class.getClassLoader());



    }

}
