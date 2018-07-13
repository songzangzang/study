package com.test.demo.cocurrent.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试线程是否能传入到主线程
 * <p>
 * 如无特殊处理，线程在抛错时不会把错传入到main线程
 *
 * @author songxibo
 * @date 2018/3/13上午11:33
 */
public class ExceptionThread implements Runnable {

    @Override
    public void run() {

        throw new RuntimeException();

    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        try {

            executorService.execute(new ExceptionThread());

        } catch (Exception e) {

            System.out.println("execute exception handler");

        }

    }

}
