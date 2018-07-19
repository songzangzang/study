package com.songxibo.jvm;

/**
 *
 * 线上上下文类加载器一般使用模式(获取 - 使用 - 还原)
 * // 获取
 * ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
 *
 * try {
 *
 *  Thread.currentThread().setContextClassLoader(targetCurrentThreadClassLoader);
 *
 * }finally {
 *
 *  Thread.currentThread().setContextClassLoader(classLoader);
 *
 * }
 *
 * 首次设置线程上下文ClassLoader是在Launcher初始化时设置的，默认设置的是系统类加载器，上下文类加载器解决的情况就是类似SPI的情况
 * 根类加载器提供了接口，但实现是由第三方实现的，所以根类加载器无法加载，是由上下文类加载器可以满足让父类调用子类而完成加载
 *
 * 注意：上下文类加载器主要的作用就是破坏委托机制
 *
 *
 * @author songxibo
 * @date 2018/7/1922:27
 */
public class ClassLoaderTest19 implements Runnable{

    private Thread thread;

    public ClassLoaderTest19() {

        thread = new Thread(this);

        thread.start();

    }

    @Override
    public void run() {

        System.out.println(this.thread.getContextClassLoader().getClass());

        System.out.println(this.thread.getContextClassLoader().getParent().getClass());

    }

    public static void main(String[] args) {

        new ClassLoaderTest19();

    }

}
