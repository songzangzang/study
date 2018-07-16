package com.songxibo.jvm.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author songxibo
 * @date 2018/7/1619:20
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 子类型必须复写这个方法返回“this”
        protected abstract T self();

    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // Item50
    }

}
