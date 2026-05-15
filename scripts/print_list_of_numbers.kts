#!/usr/bin/env kotlin

val numbers = (1..10).toList()

numbers.forEach { e -> println(e) }
numbers.forEach { println(it) }
numbers.forEach(::println)
