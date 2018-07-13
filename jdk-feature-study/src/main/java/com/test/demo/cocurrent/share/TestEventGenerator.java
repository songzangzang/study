package com.test.demo.cocurrent.share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多步操作两个数据
 *
 * @author kaeraier
 * @date 2018/3/20下午4:56
 */
public class TestEventGenerator extends Thread{

    private int number = 0;

    private int id;

    public TestEventGenerator(int ident) {

        this.id = ident;

        start();

    }

    @Override
    public void run() {

        addNumber();
        System.out.println(number);
        while (number % 2 != 0) {
            System.out.println(number + "退出");
            break;
        }

    }

    public void addNumber () {
        ++number;
        ++number;
    }

    public static void main (String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {

            executorService.execute(new TestEventGenerator(i));

        }

        executorService.shutdownNow();

    }

}
