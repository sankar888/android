//Kotlin Operators
/*
Mathematical Operators:
------------------------
 */

//Addition
var res = 1 + 2

//Subtraction
var res1 = 3 - 4

//Multiplication
var res2 = 6.3 * -12.3 //results in double

//Division
var res3 = 2.3 / 1.2 //result is double
var res4 = 1/3 // res = 0 (since there is not implicit type boxing)
var res5 = 1/3.toDouble() //res is 0.33344 Double
var res6 = 1/0 //results in error

//Modulus
var res7 = 1/3 //res is 1
var res8 = 4%2 //res is 0

/*
Assigment Operators
 */
// = , +=, -=, *=, %=
var a0 = 1
a0 += 1 //res is 2, works fine

//var a1 += 2 //will not work

/*
Logical Operators
 */
// ==, != , < , > <=, >=,
1.0 == 1 //throws Error since only same type of variables can be compared
//the same applies to all operators. Only same type of variables or values can be used in an operation, since there is no implicit casting or autoboxing in kotlin

//&&, ||, !
val ok : Boolean = true
val notOk = false
var c0 : Boolean = ok && notOk //false
ok || notOk //true
!ok //return true

//++, --, -, +,

//in - operator
//in is used check if a value exists in a collections / range

//?:, ?, !! Operators
//? is used to denote nullable variable
var n0 : Int = null //throws error
var n1 : Int? = null //ok!

// ?: operator is elvis operator which can be used to execute an operation if the variable is not null
//a==b is translated to a?.equals(b) ?: (b === null)
//If the expression to the left of ?: is not null, the elvis operator returns it, otherwise it returns the expression to the right.
var res : String? = null
res ?: "Not ok"
//res11: kotlin.String = Not ok

var res : String? = "a"
res ?: "Not ok"
//res12: kotlin.String = a


//[], .., (), ===,!==, -> Operators
//=== compares the value as well if the object is also same, the behaviour of (== and ===) might be same for primitive and data collection objects
val first = Integer(10)
val second = Integer(10)

//println(first == second)       //true
//println(first.equals(second))  //true
//println(first === second)      //false

/*
 References
 Kotlin Operators https://kotlinlang.org/docs/reference/keyword-reference.html#operators-and-special-symbols
 Null Safety and how to use ?: https://kotlinlang.org/docs/reference/null-safety.html
 */