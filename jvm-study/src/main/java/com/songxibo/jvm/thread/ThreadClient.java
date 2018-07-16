package com.songxibo.jvm.thread;

/**
 * @author kaeraier
 * @date 2018/7/1620:05
 */
public class ThreadClient {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new Invoke()).start();
        }

    }

}
