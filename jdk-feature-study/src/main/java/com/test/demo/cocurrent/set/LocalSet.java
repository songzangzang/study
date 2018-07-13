package com.test.demo.cocurrent.set;

/**
 * @author songxibo
 * @date 2018/3/21上午11:43
 */
public class LocalSet {

    private int[] array;

    private int len;

    private int index = 0;

    public LocalSet(int size) {

        array = new int[size];
        len = size;
        // init
        for (int i = 0; i < 100; i++) {

        }

    }

}


