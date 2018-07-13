package com.test.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream api的使用
 *
 * @author songxibo
 * @date 2017/12/21上午9:30
 */
public class StreamApiTest {

    public static void main(String[] args) {

        // 过滤
        List<String> list1 = Arrays.asList("1", "2", "3", "4", "5");
        list1.stream().filter(s -> !"4".equals(s)).forEach(System.out::println);

        // 使用逗号进行数据分割
        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5");
        String str = list2.stream().collect(Collectors.joining(","));
        System.out.println("逗号分割字符串 ：" + str);

        // 数据汇总
        List<String> list3 = Arrays.asList("1", "2", "3", "4", "5");
        Integer sumNumber = list3.stream().collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("总和为 ：" + sumNumber);

        // 分组
        Student student1 = new Student("test1", 11);
        Student student2 = new Student("test2", 11);
        Student student3 = new Student("test3", 13);

        List<Student> list4 = Arrays.asList(student1, student2, student3);
        Map<Integer, List<Student>> groupMap = list4.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println("按照分数进行分组 ：" + groupMap);

        // 分区
        Student stu1 = new Student("test1", 11);
        Student stu2 = new Student("test2", 12);
        Student stu3 = new Student("test3", 13);
        Student stu4 = new Student("test4", 14);
        Student stu5 = new Student("test5", 15);

        List<Student> list5 = Arrays.asList(stu1, stu2, stu3, stu4, stu5);
        Map<Boolean, List<Student>> partitionMap = list5.stream().collect(Collectors.partitioningBy(stu -> 13 > stu.getScore()));
        System.out.println("大于13进行分区处理 ：" + partitionMap);

        // 生成
        List<ArrayList<Object>> list6 = Stream.generate(ArrayList::new).limit(2).collect(Collectors.toList());
        System.out.println("生成ArrayList ：" + list6.size());

    }

}
