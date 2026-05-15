#!/usr/bin/env kotlin

// With list of numbers, we want the sum of all even numbers

val numbers = (1..10).toList()

val result = numbers
    .filter { it % 2 == 0 }
    .sumOf { it * 2 }

println("Sum is $result")


// alternative solutions
var sum = 0
for (number in numbers) {
    if (number % 2 == 0) {
        sum += number * 2
    }
}

println("Sum is $sum")

//******************

sum = 0
numbers.forEach {
    if (it % 2 == 0) {
        sum += it * 2
    }
}
println("Sum is $sum")

//******************
sum = numbers
    .filter { it % 2 == 0 }
    .map { it * 2 }
    .sum()
println("Sum is $sum")

//******************
sum = numbers
    .filter { it % 2 == 0 }
    .map { it * 2 }
    .reduce { a, b -> a + b }
println("Sum is $sum")
//******************

//println("Sum is $sum")
