### Kotlin Variables and Data Types

#### Variables
##### val vs var
In kotlin we can declare two types of variables,
- variables whose value can be changed <code>var</code>
- variables whose value cannot be changed after initialization <code>val</code>   
```kotlin
// Examples of changeable and unchangeable variables
var a : Int = 2 //var is variable, Its value is changeable
a = 5 //is allowed

val b : Int = 3 //val values cannot be changed after initial assignment
b = 7 // is not allowed, throws Error
```

#### Variables and Inferred Type   
```kotlin
var c = 4 //c is of type Int,the type is inferred
var d: Int //delayed initialization is also valid
d = 5
val e: Int //deplayed initialization is not valid for val
e = 6
```

#### Data Types
```kotlin
// Byte, Short, Int, Long, Double, Float, Char, String
var v0: Byte = 0B1011 //Byte type
var v00: Byte = 123 //Byte type
var v000: Short = 123 //Short Type
var v0000: Short = 123456 * 123456 //overflow exception
var v1 = 12 //Int Type
var v2 = 12.12 //Double Type
var v3 = 12L //Long Type
var v4 : Float = -12.2348F //Float Type
var v5 = 'A' //Chart Type
var v6 = "string" //String Type

//variables can be changed / cast from one type to another.
var c0 = 123.toLong(); //Long Type
var c1 = 123.toDouble() //Double Type
var c2 = 123.12.toInt() //Int type : 123
var c3 = 123.toString() //String Type

//once the type of a variable is set it cant be changed,
//and no implicit boxing happen when a value of different type is assigned to a variable
var d0 : Int = 123
d0 = 123L //not possible

var d1 : Int = 1
var d1 : String = "here" //not possible

var d2 : Int = 1
var d2 : Int = 3 //not possible
```