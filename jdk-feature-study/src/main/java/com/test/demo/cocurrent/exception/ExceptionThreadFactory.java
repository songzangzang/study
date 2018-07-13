package com.test.demo.cocurrent.exception;

import java.util.concurrent.ThreadFactory;

/**
 * @author kaeraier
 * @date 2018/3/13上午11:52
 */
public class ExceptionThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {

        Thread thread = new Thread(r);

        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        return thread;
    }

}
