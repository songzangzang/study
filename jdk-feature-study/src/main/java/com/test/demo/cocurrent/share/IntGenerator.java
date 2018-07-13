package com.test.demo.cocurrent.share;

/**
 * @author kaeraier
 * @date 2018/3/20下午2:38
 */
public abstract class IntGenerator {

    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel () {
        canceled = true;
    }

    public boolean isCanceled () {
        return canceled;
    }
}
