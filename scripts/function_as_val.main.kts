#!/usr/bin/env kotlin


val myFirstClassCitizenFunction = { a: Int, b: Int ->
    a + b
}


println("1 + 2 = ${myFirstClassCitizenFunction(1, 2)}")
