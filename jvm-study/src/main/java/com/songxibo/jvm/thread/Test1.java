package com.songxibo.jvm.thread;

/**
 * @author kaeraier
 * @date 2018/7/1619:56
 */
public class Test1 {

    private static Test1 test1 = new Test1();

    private String name;

    private Test1 () {}

    public static Test1 getInstance() {
        return test1;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                '}';
    }

}
