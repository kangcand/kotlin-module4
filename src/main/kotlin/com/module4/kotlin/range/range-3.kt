package com.module4.kotlin.range

fun main()
{
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne)
    {
        println("value 7 is available")
    }
}