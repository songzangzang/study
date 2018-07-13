package com.test.demo.cocurrent.join;

/**
 * @author songxibo
 * @date 2018/3/19下午1:55
 */
public class Joining {

    public static void main(String[] args) {

        Sleeper sleeper = new Sleeper("Sleepy", 1500);
        Sleeper grumpy = new Sleeper("Grumpy", 1600);

        Joiner dopey = new Joiner("Dopey", sleeper);
        Joiner doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();

    }


}
