package com.songxibo.jvm;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * jdbc获取连接加载分析
 *
 * 分析源码得知，主动使用DriverManager的时候，DriverManager的static代码块会主动加载全部的实现类，
 * 待测试，是否不使用Class.forName也能直接获取到连接。
 *
 * @author songxibo
 * @date 2018/7/2118:17
 */
public class ClassLoaderTest21 {

    public static void main(String[] args) throws Exception {

        /*
             只传一个参数等价于Class.forName("com.mysql.jdbc.Driver", true, currentClassLoader);
             也就是说会将传入的二进制名称进行初始化，加载的加载器使用的就是调用者的加载器，当前就是系统类极爱扎起
         */
        Class.forName("com.mysql.jdbc.Driver");

        /*
            首先会看当前调用者是否有类加载器，如果有就用调用者的，如果没有会使用上下文类加载器进行加载
         */
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

    }

}
