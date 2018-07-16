package com.songxibo.jvm;

/**
 * 配合ClassLoaderTest16 进行测试
 *
 * @author songxibo
 * @date 2018/7/1513:02
 */
public class MyDuplicate {

    private MyDuplicate myDuplicate;

    public void setMyDuplicate(Object object) {
        this.myDuplicate = (MyDuplicate) object;
    }

}
