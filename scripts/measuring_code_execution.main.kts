#!/usr/bin/env kotlin


import java.lang.Thread.sleep
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

/*
Kotlin provides a simple-to-use way to measure how long a code block take to run
 */

val timeInMillis = measureTimeMillis{
    println("Hello milli measurement")
}

println("Completed in $timeInMillis ms")

/*
There are also measureTime and measureTimeNanos
 */

val timeInSeconds = measureTime {
    println("Hello World")
    sleep(2000)
}

println("Completed in $timeInSeconds s")

val timeInNanos = measureNanoTime {
    println("Adding numbers in string expression ${1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9}")
}

println("Completed in $timeInNanos ns")