package com.module4.kotlin.range

fun main()
{
    val ranges = 1..10 step 2
    ranges.forEach{
        print("$it ")
    }
    println(ranges.step)
}