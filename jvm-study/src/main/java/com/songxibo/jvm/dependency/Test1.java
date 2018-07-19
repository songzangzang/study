package com.songxibo.jvm.dependency;

/**
 * @author kaeraier
 * @date 2018/7/1721:37
 */
public class Test1 {

    private Test2 test2;

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    public Test2 getTest2() {
        return test2;
    }
}

class Test2 {

    public String name;

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                '}';
    }
}


