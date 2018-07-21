package com.songxibo.jvm.staticfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaeraier
 * @date 2018/7/2000:13
 */
public class StaticTest {

    public static void testArrayList (String a) {

        List<String> list = new ArrayList<>();
        list.add(a);
        System.out.println(list);

    }

    public static void main(String[] args) {

        StaticTest.testArrayList("1");

        StaticTest.testArrayList("2");

        StaticTest.testArrayList("3");

    }

}
