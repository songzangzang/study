package com.songxibo.jvm;

/**
 * 类加载器说明
 * 类加载器在加载ClassA类时如果ClassA类依赖ClassB类，那么会使用加载ClassA类的加载器加载ClassB（在B没有被加载的情况下），
 * 加载时也是按照双亲委托模型从下至上的顺序进行加载。
 *
 * 线程上下文加载器
 * 线程上线文加载器使用setContextClassLoader(ClassLoader)进行赋值，使用getContextClassLoader()进行获取
 * 里面存入的通常是系统类加载器，它主要为了解决SPI相关的问题，因为SPI(service provide interface)是由根类加载器进行加载的，
 * 但具体实现是由厂商所实现的，厂商实现的代码会防止到ClassPath目录，这样根类加载器无法进行加载对应实现，所以采用线程上下文加载器
 * 破坏双亲委托模型，让父类调用子类的构造器进行加载
 *
 *
 *
 * @author songxibo
 * @date 2018/7/1908:47
 */
public class ClassLoaderTest18 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getContextClassLoader());

        System.out.println(Thread.class.getClassLoader());

    }

}
