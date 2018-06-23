package com.songxibo.jvm;

/**
 * 类加载器，被动加载测试
 *
 * @author songxibo
 * @date 2018/6/20下午11:15
 */
public class ClassLoaderTest1 {

    public static void main(String[] args) {

        /**
         *
         * Parent Init
         * 1
         *
         * 调用父类的静态变量不在主动加载的七种情况所以不会初始化子类，首先父类会把静态变量进行初始化，然后把值赋给子类的区域
         */
        System.out.println(Child.a);


        /**
         *   Parent Init
         *   Child Init
         *   1
         *
         *  属于主动加载所以会对Child类进行初始化，在初始化的过程里首先会把父类进行初始化
         */
//        System.out.println(Child.b);

    }

    public static class Parent1 {

        public static int a = 1;

        static {

            System.out.println("Parent Init");

        }

    }

    public static class Child extends Parent1 {

        public static int b = 1;

        static {

            System.out.println("Child Init");

        }

    }


}
