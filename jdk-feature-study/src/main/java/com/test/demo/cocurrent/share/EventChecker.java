package com.test.demo.cocurrent.share;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kaeraier
 * @date 2018/3/20下午2:41
 */
public class EventChecker implements Runnable {
    private IntGenerator generator;

    private int id = 0;

    public EventChecker(IntGenerator generator, int ident) {
        this.generator = generator;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + "not event");
                generator.cancel(); // 取消全部
            }
        }
    }

    // test any type of IntGenerator
    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EventChecker(gp, i));
        }
        exec.shutdownNow();
    }

}
