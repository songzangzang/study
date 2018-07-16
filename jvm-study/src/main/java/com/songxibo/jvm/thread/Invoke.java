package com.songxibo.jvm.thread;

import java.util.Random;
import java.util.UUID;

/**
 * @author kaeraier
 * @date 2018/7/1619:57
 */
public class Invoke implements Runnable {

    @Override
    public void run() {

        Test1 instance = Test1.getInstance();
        instance.setName(Thread.currentThread().getName() + UUID.randomUUID());
        System.out.println(instance.hashCode());

        System.out.println(instance);

    }

}
