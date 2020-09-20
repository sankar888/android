/**
 * Control flow statements
 */
//for, while, do..while
//if, if..else, when

fun usageIf() {
    //if can be used as control statement like below
    if (5 > 3) println("if without braces in a single line")
    if (5 > 3 )
        println("single if statements without braces")
        println("This will print irrespective of the previous if")
    if (5 > 3) {
        println("if statement with braces")
    }
    if ( 5 > 3) {
        println("demonstration of if with else, in if block")
    } else {
        println("demonstration of if with else, in else block")
    }
    //if else if
    if ( 5 < 4) {
        println(" 5 is less tha 4")
    } else if ( 5 < 3) {
        println(" 5 is less than 3")
    } else {
        println("No condition matched")
    }

    //Also if statement can be used as a statement to assign a value to a variable
    //this is similar to ?: operator in java
    var max : Int = if (5 > 3) 5 else 3
    println(max)

    var maxWord: String = if (7 > 4) {
        println("Seven is choosed")
        "Seven"
    } else {
        println("Four is choosed")
        "Four"
    }
    println(maxWord)
}

fun usageWhen() {
   //When can be used as a statement as well as control statement
   var no : Int = 7
   when (no) {
       7 -> println("No. is seven")
       else -> println("No is not seven")
   }

    no = 5
    when(no) {
        is Any -> println("Am Any")
        1 -> {
            println("No is one")
        }
        2 -> println("No is 2")
        in arrayOf(3,4) -> println("No is in array")
        in 3..5 -> println("No. is in range")
        else -> {
            println("No is not one")
        }

    }

    //when as expression
    //If when is used as an expression, the else branch is mandatory
    no = 3
    var res = when(no) {
        1 -> "No is One"
        3 -> "No is three"
        else -> "I dont know this no"
    }
    println(res)
}

/*
 * Loops
*/
fun usageFor() {
//for loop iterates through anything that provides an iterator
//basic usage: for (item in collection) print(item)
    for (i in 1..4) {
        println(i)
    }
    for (i in 7 downTo 0 step 2) {
        println(i)
    }
    val arr : Array<String> = arrayOf("a", "b", "c")
    for (item in arr) {
        println(item)
    }
    //prints abc
    for (index in arr.indices) {
        println(index)
    }
    //prints 012
    for ( (index, value) in arr.withIndex()) {
        println("$index ... $value")
    }
    //prints
    // 0 ... a
    // 1 ... b
    // 2 ... c
}

fun usageWhile() {
    /*while (x > 0) {
        x--
    }

    do {
        val y = retrieveData()
    } while (y != null) // y is visible here!
    */
    var a : Int = 9
    while (a > 0) {
        println(a)
        a--
    }

    var b = 4
    do {
        println("$b")
        b--
    } while (b > 0)
    //prints 4321
}