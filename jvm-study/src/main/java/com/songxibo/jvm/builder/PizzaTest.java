package com.songxibo.jvm.builder;

import static com.songxibo.jvm.builder.NyPizza.Size.SMALL;
import static com.songxibo.jvm.builder.Pizza.Topping.HAM;

/**
 * @author kaeraier
 * @date 2018/7/1619:27
 */
public class PizzaTest {

    public static void main(String[] args) {

        NyPizza build = new NyPizza.Builder(SMALL).addTopping(HAM).build();

        System.out.println(build);

    }

}
