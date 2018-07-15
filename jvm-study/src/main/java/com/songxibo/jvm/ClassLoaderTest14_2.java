package com.songxibo.jvm;

/**
 * 和ClassLoaderTest14相似
 *
 * 操作步骤
 * 1. 在Class目录中删除MyCat
 * 程序会正常运行MyCat和MySample都会正常被加载
 * MyCat是自定义加载器进行加载的
 * MySample是系统加载器进行加载的（因为自定义加载首先会委托系统类加载器进行加载）
 *
 * 2. 在Class目录中删除MySample
 * 会报错，因为在一个类中主动初始化另一个，第二个的类加载器就是加载第一个类的类加载器，
 * 因为删除了MySample所以委托机制到系统类加载器还是会加载失败
 *
 * 3. 关于命名空间
 * 首先删除MyCat的Class文件，然后在MyCat打印MySample的Class 这时代表子类中打印父类
 * 然后在MySample中打印MyCat的Class 这时代表父类打印子类不会成功
 * 说明：命名空间是由类加载及其所有父类组成的
 *  3.1 子类可以看见所有被父类加载的类
 *  3.2 父类看不到被子类加载器加载的类
 *
 * @author songxibo
 * @date 2018/7/15 00:29
 */
public class ClassLoaderTest14_2 {

    public static void main(String[] args) throws Exception{

        MyClassLoader myClassLoader = new MyClassLoader("classLoaderTest14-2");
        myClassLoader.setPath("/Users/kaeraier/Desktop/");

        Class<?> clazz = myClassLoader.loadClass("com.songxibo.jvm.MyCat");
        System.out.println(clazz.hashCode());

        Object o = clazz.newInstance();
        System.out.println(o);

    }

}
