package com.songxibo.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 创建自己的类加载器
 *
 * @author songxibo
 * @date 2018/7/710:42
 */
public class ClassLoaderTest13 {

    public static void main(String[] args) throws ClassNotFoundException {

        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        System.out.println(classLoader.getParent());

        try {

            Object o = classLoader.loadClass("com.songxibo.jvm.ClassLoaderTest1").newInstance();
            System.out.println(classLoader);
            System.out.println(o);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}

class MyClassLoader extends ClassLoader {

    private String name;

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    public MyClassLoader(String name) {
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String path = null;

        if (name.contains("/")) {

            path = name;

        } else {

            StringBuilder sb = new StringBuilder("");
            sb.append(name.replace(".", "/"));
            sb.append(".class");
            path = sb.toString();

        }

        File file = new File(path);
        try {

            FileInputStream fs = new FileInputStream(file);
            byte[] bytes = new byte[fs.available()];
            fs.read(bytes);
            return defineClass(name, bytes, 0, bytes.length);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    /**
     * 继续使用双亲委托模型
     *
     *
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    public String toString() {
        return "MyClassLoader{" +
                "name='" + name + '\'' +
                '}';
    }
}
