package com.test.demo.cocurrent;

/**
 * Task1 线程
 *
 * @author songxibo
 * @date 2018/3/11下午5:30
 */
public class Task1Thread {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            new Thread(new Task1()).start();

        }

    }

}
