package com.test.demo;

import java.util.function.Function;

/**
 * Function API的使用
 *
 * @author songxibo
 */
public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Integer> function1 = value -> value + 1;
        Function<Integer, Integer> function2 = value -> value - 1;
        Function<Integer, Integer> function3 = value -> value / 1;
        Function<Integer, Integer> function4 = value -> value * 1;

        // 使用apply方法进行调用Function里传入的函数表达式
        FunctionTest.arithmeticTest(function1, 3);

        // 使用compose进行两次Function表达式的调用, 会先调用第一个Function执行后会调用第二个
        FunctionTest.arithmeticTest(function1.compose(function2), 3);

        // 使用andThen进行两次调用, 调用顺序正好是和compose是相反的
        FunctionTest.arithmeticTest(function1.andThen(function2), 3);

    }

    /**
     * 按照传入的Fuction进行计算
     *
     * @param function
     * @param num
     */
    public static void arithmeticTest(Function<Integer, Integer> function, int num) {
        System.out.println(function.apply(num));
    }


}