package com.songxibo.jvm.dependency;

/**
 * 为什么Spring的单例的但是运行也不会出现问题
 *
 * @author kaeraier
 * @date 2018/7/1721:38
 */
public class Test1Client {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        test2.name = "test2";

        test1.setTest2(test2);

        System.out.println(test2);
        System.out.println(test1.getTest2());

    }

}
