### Kotlin Functions
Functions in Kotlin are declared using the <code>fun</code> keyword
Function parameters are defined using Pascal notation, 
i.e. name: type. Parameters are separated using commas. Each parameter must be explicitly typed
```kotlin
fun hello(name: String = "Sankar"): String {
    return "Hello, $name"
}
val greetings = hello()
println(greetings) //Hello, Sankar
```
#### Default Value and NamedParameters 
Like python kotlin has Default value for parameters, which brings in some complexity when passing arguments to function
```kotlin
fun decorate(word: String, prefix: String = "prefix", mark: Boolean = true): String {
    val res = "$prefix-$word"
    if (mark) {
        return res.toUpperCase()
    } else {
        return res
    }
}
decorate() //error: no value passed for parameter 'word'
decorate("hai") //result is PREFIX-HAI, default parameters used for prefix and capitalize
decorate(word = "Hello") //result is PREFIX-HELLO
decorate("hai", false) //error: the boolean literal does not conform to the expected type String
decorate("hai", mark=false) //result is prefix-hai
``` 
When all parameters has default values
```kotlin
fun decorate(word: String="Hello", prefix: String = "prefix", mark: Boolean = true): Any {
    val res = "$prefix-$word"
    if (mark) {
        return res.toUpperCase()
    } else {
        return res
    }
}
decorate() //result = PREFIX-HELLO
decorate("Hai",mark=false,prefix="pre")  //result pre-Hai
```
If the last argument after default parameters is a lambda, you can pass it either as a named argument or outside the parentheses
```kotlin
fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) { /*...*/ }

foo(1) { println("hello") }     // Uses the default value baz = 1
foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1 
foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
```
#### Function Return Types
By default, if no return type is specified <code>Unit</code> is returned.
```kotlin
fun hello(): Unit {
    println("Hello, World")
}
//The return type is not mandatory, if omitted always Unit type is returned
fun hello() {
    println("Hello, World")
}
```
#### Single Expression Functions
If a function has only one expression, the curly braces can be omitted and the expression can be declared after = 
```kotlin
fun square(no: Int = 2): Int = no*no
fun square(no: Int = 2) = no*no //Since return type is optional, this is also equally valid
```

#### Inner Functions   




### Reference
1. [Kotlin Functions](https://kotlinlang.org/docs/reference/functions.html)


