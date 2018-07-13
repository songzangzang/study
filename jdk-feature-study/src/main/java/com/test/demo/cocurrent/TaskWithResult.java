package com.test.demo.cocurrent;

import java.util.concurrent.Callable;

/**
 * 带返回值得线程流程实现
 *
 * @author songxibo
 * @date 2018/3/12上午9:11
 */
public class TaskWithResult implements Callable {

    private int id;

    public TaskWithResult(int id) {

        this.id = id;

    }

    @Override
    public String call() throws Exception {

        return "result with TaskWithResult " + id;

    }

}
