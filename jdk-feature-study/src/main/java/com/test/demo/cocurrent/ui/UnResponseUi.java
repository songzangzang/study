package com.test.demo.cocurrent.ui;

import java.io.IOException;

/**
 * @author kaeraier
 * @date 2018/3/20上午11:23
 */
public class UnResponseUi {

    private volatile double d = 1;

    public UnResponseUi() throws IOException {

        while (d > 0) {

            d = d + (Math.PI + Math.E) / d;

            System.in.read(); // never get here

        }

    }

}
