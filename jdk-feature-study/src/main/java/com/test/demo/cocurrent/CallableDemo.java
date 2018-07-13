package com.test.demo.cocurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 带返回值响应测试
 *
 * @author songxibo
 * @date 2018/3/12上午9:16
 */
public class CallableDemo {

    public static void main(String[] arg) {


        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            list.add(exec.submit(new TaskWithResult(i)));

        }

        list.forEach(s -> {
            try {
                if (s.isDone()) {

                    System.out.println(s.get());

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }

}
