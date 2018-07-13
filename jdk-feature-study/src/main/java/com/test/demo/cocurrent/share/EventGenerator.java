package com.test.demo.cocurrent.share;

/**
 * @author kaeraier
 * @date 2018/3/20下午2:54
 */
public class EventGenerator extends IntGenerator {

    private int number;

    @Override
    public synchronized int next() {
        ++number;
        ++number;
        return number;
    }


    public static void main(String[] args) {

//        EventGenerator eventGenerator = new EventGenerator();
//
//        for (int i = 0; i < 100; i++) {
//            int next = eventGenerator.next();
//            if (next % 2 != 0)
//                System.out.println(next + " 单数");
//        }

        EventChecker.test(new EventGenerator(), 10);


    }
}
