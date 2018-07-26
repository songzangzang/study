package com.kotlin.study

fun main(args: Array<String>) {

    // 初始化打印
    println("Hello world")

    // 判断
    if (args.size == 0) {
        println("please provider a argument")
        return
    }
    println(args[0])

    // 循环1
    for (arg in args) {
        println(arg)
    }

}
