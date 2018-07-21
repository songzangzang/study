package com.songxibo.jvm;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 上下文类加载器的使用场景
 * 1. 使用ServiceLoader加载Driver
 * 2. 打印出iterator内的内容
 * 3. 分析内部加载逻辑
 *
 * @author songxibo
 * @date 2018/7/2118:01
 */
public class ClassLoaderTest20 {

    public static void main(String[] args) {

        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);

        // 加载实现类的规则详情看ServiceLoader
        Iterator<Driver> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {

            Driver driver = iterator.next();
            System.out.println(driver);

        }

    }

}
