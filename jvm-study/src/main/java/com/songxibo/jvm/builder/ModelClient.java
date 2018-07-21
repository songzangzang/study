package com.songxibo.jvm.builder;

/**
 * @author kaeraier
 * @date 2018/7/2000:29
 */
public class ModelClient {

    public static void main(String[] args) {

        Model model = new Model.Builder().age(1).name("卡尔大魔王").build();

        System.out.println(model);

    }

}
