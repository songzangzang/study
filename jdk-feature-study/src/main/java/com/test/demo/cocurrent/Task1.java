package com.test.demo.cocurrent;

/**
 * 实现Runnable, 在run内打印一个消息然后调用yield(), 重复这个操作三次
 * 然后从run（）返回，在构造器中放置一条启动信息，并且放置一条在任务终止时的关闭消息
 * 并创建大量线程任务并驱使它们
 *
 * @author songxibo
 * @date 2018/3/11下午4:57
 */
public class Task1 implements Runnable {

    private static int taskCount = 0;

    private final int id = taskCount++;

    public Task1() {
        System.out.println("任务开始");
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {

            System.out.println(id + " --> " + "当前是第几" + i + "次数");

            Thread.yield();

            if (i == 2) {

                System.out.println("任务结束");
            }

        }

    }

}
