#!/usr/bin/env kotlin

val numbers = (1..20).toList()
println(numbers)

val filteredList = numbers
    .filter { it % 2 == 0 }
    .subList(0, 3)
println(filteredList)

println("Sum is ${filteredList.sum()}")
