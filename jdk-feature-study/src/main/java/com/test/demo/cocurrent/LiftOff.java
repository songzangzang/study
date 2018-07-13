package com.test.demo.cocurrent;

/**
 * concurrent 例子, 用来实现Runnable
 *
 * @author songxibo
 * @date 2018/3/11下午4:30
 */
public class LiftOff implements Runnable {

    protected int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {

        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ") ";

    }

    @Override
    public void run() {

        while (countDown-- > 0) {

            System.out.println(status());

            // 主动放弃线程
            Thread.yield();

        }

    }

}
