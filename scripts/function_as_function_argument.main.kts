#!/usr/bin/env kotlin

// We define magicCalculation as a method that accepts an Int and a method, which method accepts a Double and returns nothing
fun magicCalculation(n: Int, action: (Double) -> Unit) {
    // The function invokes the provided action, with a Double argument
    action(n * 3.14)

//    action(n+2)
    // Above will not compile as n+2 is not Double
}

// Then we invoke our method with 7 and a provided action of a simple println (which does accept Doubles)
magicCalculation(7, { println(it) })
magicCalculation(7, ::println)

// When the lambda is defined as the last argument, we can also write the following!:
magicCalculation(7) { println(it) }