package com.songxibo.jvm.enum1;

/**
 * @author kaeraier
 * @date 2018/7/1613:01
 */
public enum EnumTest implements BaseEnum{

    INSTANCE(new Object());

    private Object object;

    EnumTest(Object obj) {
        this.object = obj;
    }

    @Override
    public Object getInstance() {
        return object;
    }

}
