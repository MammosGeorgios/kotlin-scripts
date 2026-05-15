#!/usr/bin/env kotlin


val numbers = (1..3).toList()
println(numbers)
//[1, 2, 3]

println(numbers.map { e -> e + 1 })
//[2, 3, 4]

println(numbers.map { e -> listOf(e - 1, e + 1) })
//[[0, 2], [1, 3], [2, 4]]

println(numbers.flatMap { e -> listOf(e - 1, e + 1) })
//[0, 2, 1, 3, 2, 4]

//above is same as
println(numbers.map { e -> listOf(e - 1, e + 1) }.flatten())
