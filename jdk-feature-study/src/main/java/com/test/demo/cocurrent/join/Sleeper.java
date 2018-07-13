package com.test.demo.cocurrent.join;


/**
 * 编程思想P1143
 *
 * @author songxibo
 * @date 2018/3/19下午1:40
 */
public class Sleeper extends Thread {

    private int duration;

    public Sleeper(String name, int sleepTime) {

        super(name);

        duration = sleepTime;

        start();

    }

    @Override
    public void run() {

        try {

            sleep(duration);

        } catch (Exception e) {

            System.out.println(getName() + " join completed, isInterrupted()" + isInterrupted());

        }

        System.out.println(getName() + " awakened");

    }

}
