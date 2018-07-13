package com.test.demo.cocurrent.ui;

import java.io.IOException;

/**
 * @author kaeraier
 * @date 2018/3/20上午11:26
 */
public class ResponseUi extends Thread{

    private static volatile double d = 1;

    public ResponseUi() {

       setDaemon(true);

       start();

    }

    @Override
    public void run() {

        while (true) {

            d = d + (Math.PI + Math.E) / d;

        }

    }

    public static void main (String[] args) throws IOException {

        new UnResponseUi();

        System.in.read();

        System.out.println(d);

    }

}
