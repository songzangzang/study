package com.kotlin.study

fun main(args: Array<String>) {

    // 遍历循环的几种方式
    print1()
    print2()
    print3()

    // 使用when 类比 java中的if或是switch
    println(when1("hello"))
    println(when1("world"))
    println(when1("value"))
    println(when2("hello"))
    println(when2("world"))


}

fun print1() {

    var str: Array<String> = arrayOf("number1", "number2", "number3")

    for (s in str) {
        println(s)
    }

}

fun print2() {

    var int = intArrayOf(1, 2, 3, 4, 5)

    for (i: Int in int.indices) {
        println("$i 位置的元素为 ${int[i]}")
    }

}

fun print3() {

    var int = intArrayOf(1, 2, 3, 4, 5, 6, 7);

    for ((index, value) in int.withIndex()) {
        println("$index = $value")
    }

}

fun when1(str: String): String {

    return when (str) {
        "hello" -> "HElLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "default value"
    }

}

fun when2(x: String) = when (x) {"hello" ->  "HELLO" else -> "hello"}