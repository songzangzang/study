package com.test.demo.cocurrent.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kaeraier
 * @date 2018/3/13上午11:53
 */
public class Exception2Client {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool(new ExceptionThreadFactory());

        try {

            executorService.execute(new ExceptionThread2());

        } catch (Exception e) {

            System.out.println("execute exception handler");

        }

    }

}
