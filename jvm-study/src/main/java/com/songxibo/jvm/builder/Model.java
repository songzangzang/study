package com.songxibo.jvm.builder;

/**
 * @author kaeraier
 * @date 2018/7/2000:26
 */
public class Model {

    private String name;

    private String password;

    private int age;

    public Model(Builder builder) {

        name = builder.name;
        password = builder.password;
        age = builder.age;

    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private String name;

        private String password = "12345";

        private int age;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Model build() {

            return new Model(this);

        }

    }

}

