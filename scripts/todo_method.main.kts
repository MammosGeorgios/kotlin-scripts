#!/usr/bin/env kotlin

println("Hello TODO world")

TODO("Never gonna happen")


/*
Above code actually runs and crashes when we reach the todo method

kotlin.NotImplementedError: An operation is not implemented: Never gonna happen
        at Todo_method_main.<init>(todo_method.main.kts:5)

 */