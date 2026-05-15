#!/usr/bin/env kotlin

val sequence = sequence {
    println("One [${Thread.currentThread().name}]")
    yield(1)

    println("Two [${Thread.currentThread().name}]")
    yield(2)

    println("Three [${Thread.currentThread().name}]")
    yield(3)
}

for (value in sequence) {
    println("The value $value [${Thread.currentThread().name}]")
}

/* The above prints
One [main]
The value 1 [main]
Two [main]
The value 2 [main]
Three [main]
The value 3 [main]
 */