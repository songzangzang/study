package com.test.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 流测试
 *
 * @author songxibo
 * @date 2017/12/10下午4:34
 */
public class StreamSortTest {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(3, 5, 7, 9, 10, 1, 2, 4, 8, 6);

        // 正序
        List<Integer> sortArray = array.stream().sorted().collect(Collectors.toList());
        sortArray.forEach(i -> System.out.println(i));

        // 倒序
        List<Integer> sortArray2 = array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortArray2.forEach(s -> System.out.println(s));

    }

}
