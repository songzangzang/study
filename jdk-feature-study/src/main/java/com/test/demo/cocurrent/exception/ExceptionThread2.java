package com.test.demo.cocurrent.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试是否能传入main线程2
 *
 * @author songxibo
 * @date 2018/3/13上午11:42
 */
public class ExceptionThread2 implements Runnable{

    @Override
    public void run() {

        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + ": " + thread.getUncaughtExceptionHandler());

        throw new RuntimeException();

    }

}
