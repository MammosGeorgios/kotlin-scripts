#!/usr/bin/env kotlin


val myFirstClassCitizenFunction = { a: Int, b: Int ->
    a + b
}

println("1 + 2 = ${myFirstClassCitizenFunction(1, 2)}")


val printIt: (Int) -> Unit = { number -> println(number) }
printIt(5)

val printIt2 = {number: Int -> println(number)} // also works
printIt2(6)
println( "val printIt2 has kotlin qualifiedName: ${printIt2.javaClass.kotlin.qualifiedName}")
println( "val printIt2 has kotlin simpleName: ${printIt2.javaClass.kotlin.simpleName}")
