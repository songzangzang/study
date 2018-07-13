package com.test.demo.cocurrent.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 确定通用异常时进行处理
 *
 *
 * @author kaeraier
 * @date 2018/3/13下午1:53
 */
public class Exception2Client2  {

    public static void main (String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new ExceptionThread2());

    }

}
