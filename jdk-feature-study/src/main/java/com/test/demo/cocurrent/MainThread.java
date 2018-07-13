package com.test.demo.cocurrent;

/**
 * concurrent 主线程
 *
 * 在同一线程启动不同的线程数据会进行共享
 *
 * @author songxibo
 * @date 2018/3/11下午4:39
 */
public class MainThread {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            new Thread(new LiftOff()).start();

        }


    }

}
