package com.module4.kotlin.loop

fun main()
{
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach{
        value -> println("value is $value")
    }
}