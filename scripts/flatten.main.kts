#!/usr/bin/env kotlin

val numbers = listOf(listOf(1, 2), listOf(3, 4, 5))
println("Size is ${numbers.size}")
println(numbers)


println("Flattening numbers with numbers.flatten")
val flattenedNumbers = numbers.flatten()
println("Size is ${flattenedNumbers.size}")
println(flattenedNumbers)

