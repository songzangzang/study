package com.kotlin.study

fun main(args: Array<String>) {
    println(add("2", "dd"))
}

fun multiplying(a: Int, b: Int): Int {
    return a * b
}

fun convertToInt(a: String): Int? {
    return try {
        a.toInt()
    } catch (ex: NumberFormatException) {
        null
    }
}

fun add(a: String, b: String): Int? {
    val convertA = convertToInt(a)
    val convertB = convertToInt(b)
    return if (convertA != null && convertB != null) convertA + convertB else null
}
