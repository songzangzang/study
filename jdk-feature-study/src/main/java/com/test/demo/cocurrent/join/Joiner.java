package com.test.demo.cocurrent.join;

/**
 * @author songxibo
 * @date 2018/3/19下午1:50
 */
public class Joiner extends Thread {

    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {

        super(name);

        this.sleeper = sleeper;

    }

    @Override
    public void run() {

        try {

            sleeper.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println(getName() + "join completed");

    }

}
