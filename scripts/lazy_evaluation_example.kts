#!/usr/bin/env kotlin

fun isGreaterThan3(n: Int): Boolean {
    println("isGreaterThan3 method call for $n")
    return n > 3
}

fun isEven(n: Int): Boolean {
    println("isEven method call for $n")
    return n % 2 == 0
}


val numbers = (1..10).toList()

println(
    "Without sequence eval: ${
        numbers
            .filter { isGreaterThan3(it) }
            .filter { isEven(it) }
            .map { it * 2 }
            .first()
    }"
)

println(
    "With sequence eval: ${
        numbers
            .asSequence()
            .filter { isGreaterThan3(it) }
            .filter { isEven(it) }
            .map { it * 2 }
            .first()
    }"
)

/*
The printed results are as follows

isGreaterThan3 method call for 1
isGreaterThan3 method call for 2
isGreaterThan3 method call for 3
isGreaterThan3 method call for 4
isGreaterThan3 method call for 5
isGreaterThan3 method call for 6
isGreaterThan3 method call for 7
isGreaterThan3 method call for 8
isGreaterThan3 method call for 9
isGreaterThan3 method call for 10
isEven method call for 4
isEven method call for 5
isEven method call for 6
isEven method call for 7
isEven method call for 8
isEven method call for 9
isEven method call for 10
Without sequence eval: 8


isGreaterThan3 method call for 1
isGreaterThan3 method call for 2
isGreaterThan3 method call for 3
isGreaterThan3 method call for 4
isEven method call for 4
With sequence eval: 8

 */

