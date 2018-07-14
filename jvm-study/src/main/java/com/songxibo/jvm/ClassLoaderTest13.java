package com.songxibo.jvm;

import java.io.File;
import java.io.FileInputStream;

/**
 * 说明
 * 因为加载的不是根目录，所以系统加载器找不到不能加载，所以会触发自定义加载器进行加载
 *
 *
 * 创建自己的类加载器
 *
 * @author songxibo
 * @date 2018/7/710:42
 */
public class ClassLoaderTest13 {

    public static void main(String[] args) throws Exception {

        MyClassLoader classLoader = new MyClassLoader("myClassLoader");
        classLoader.setPath("/Users/kaeraier/Desktop/");
        System.out.println(classLoader.getParent());

        Class clazz = classLoader.loadClass("com.songxibo.jvm.ClassLoaderTest1");
        System.out.println(clazz.hashCode());
        Object o = clazz.newInstance();
        System.out.println(o);

        System.out.println("------");

        MyClassLoader classLoader2 = new MyClassLoader("myClassLoader2");
        classLoader2.setPath("/Users/kaeraier/Desktop/");
        System.out.println(classLoader2.getParent());

        Class clazz2 = classLoader2.loadClass("com.songxibo.jvm.ClassLoaderTest1");
        System.out.println(clazz2.hashCode());
        Object o2 = clazz2.newInstance();
        System.out.println(o2);

    }

}

class MyClassLoader extends ClassLoader {

    private String name;

    private String path = "";

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    public MyClassLoader(String name) {

        super();
        this.name = name;

    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        System.out.println("myClassLoader print");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(path).append(name.replace(".", "/")).append(".class");
        File file = new File(stringBuilder.toString());
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


    @Override
    public String toString() {
        return "MyClassLoader{" +
                "name='" + name + '\'' +
                '}';
    }
}
