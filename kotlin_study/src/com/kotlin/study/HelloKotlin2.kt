package com.kotlin.study

import com.kotlin.study.multiplying

fun main(args: Array<String>) {

    println(sum(1, 2))

    println(sum2(1, 2))

    println(printList())

    println(multiplying(3, 4))

    println(convertToInt("af"))

}

fun sum(a: Int, b: Int): Int {

    return a + b

}

fun sum2(a: Int, b: Int) = a + b

fun printList() {

    val intArrayOf = intArrayOf(1, 2, 3, 4)

    for (a in intArrayOf) {
        println(a)
    }
}