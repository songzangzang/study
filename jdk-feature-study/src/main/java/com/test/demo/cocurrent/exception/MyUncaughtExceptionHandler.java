package com.test.demo.cocurrent.exception;

/**
 * @author songxibo
 * @date 2018/3/13上午11:41
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {

        System.out.println("exception" + e);

    }

}
