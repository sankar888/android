### Learn Kotlin
##### Kotlin Foundation
The Kotlin Foundation was created by JetBrains and Google with the mission to protect, promote and advance the development of the Kotlin programming language. 
The Foundation secures Kotlin's development and distribution as Free Software, 
meaning that it is able to be freely copied, modified and redistributed, including modifications to the official versions.

##### Why Kotlin
At Google I/O 2019, we announced that Android development will be increasingly Kotlin-first, 
and we’ve stood by that commitment. Kotlin is an expressive and concise programming language that reduces common code errors and easily integrates into existing apps. 
If you’re looking to build an Android app, we recommend starting with Kotlin to take advantage of its best-in-class features.
Android commitments to kotlin: https://android-developers.googleblog.com/2019/12/androids-commitment-to-kotlin.html

#### Kotlin Bootcamp
##### Hello World
Run kotlin shell (REPL) - read execute print loop to try out kotlin commands
Start Kotlin REPL from Intellij Idea -> Tools ->  Kotlin -> Kotlin REPL
```shell script
"C:\Program Files\java-se-8u41-ri\bin\java.exe" -Dkotlin.repl.ideMode=true -Dfile.encoding=UTF-8 \
-classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3\lib\idea_rt.jar;C:\Users\sankaraa\AppData\Local\Temp\classpath1425140193.jar" \
com.intellij.rt.execution.CommandLineWrapper C:\Users\sankaraa\AppData\Local\Temp\classpath1425140193.jar org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
```
REPL uss kotlin to java compiler to execute kotlin commands

##### Operators and Data Types
- Operators
    - + Addition
    - Subtraction
    - / Division
    - * Multiplication
- DataTypes
    - Byte
    - Int
    - Double
    - Float
    - String
- Var vs Val    
   - var is used to denote changeable value
   - val is used to denote unchangeable value
```kotlin
1+1
//res46: kotlin.Int = 2 result type Int 

1+1.2
//res47: kotlin.Double = 2.2 result type Double

1/2
//res48: kotlin.Int = 0 result type Int

1.0/2
//res49: kotlin.Double = 0.5 result type Double
```
- Variables acan be declared with or without explicit Type
```kotlin
//explicit Type declaration
var a: Int = 3
a
//res50: kotlin.Int = 3

//Implicit Type
var a = 4
a
//res51: kotlin.Int = 4

//Implicit Type
var c = -4.387
c
//res52: kotlin.Double = -4.387
```   

The following features may be different in Kotlin than what you're used to in other languages:

    Kotlin types can't be implicitly converted—use casting.
    Variables declared with val can only be assigned once.
    Kotlin variables are not nullable by default. Use ? to make variables nullable.
    With Kotlin, you can loop through the index and elements of an array at the same time in a for loop.

The following Kotlin programming constructs are similar to those in other languages:

    Arrays and lists can have a single type or mixed types.
    Arrays and lists can be nested.
    You can create loops with for, while, do/while, and repeat.
    The when statement is Kotlin's version of the switch statement, but when is more flexible.

### Resources and References
1. [Android 11 weeks challenge](https://developer.android.com/courses/topics/android-11-weeks)
2. [Kotlin Learning Resources](https://developer.android.com/kotlin/first)
3. [Kotlin Foundation](https://kotlinlang.org/foundation/kotlin-foundation.html)
4. [Kotlin Bootcamp](https://codelabs.developers.google.com/kotlin-bootcamp/)
5. [Udacity: Developing Android Apps with Kotlin](https://www.udacity.com/course/developing-android-apps-with-kotlin--ud9012)
6. [Udacity: Advanced Android with Kotlin](https://www.udacity.com/course/advanced-android-with-kotlin--ud940)
7. [Official Kotlin Docs](https://kotlinlang.org/docs/reference/)
8. [Kotlin Site](https://kotlinlang.org/)
9. [Kotlin Playground](https://play.kotlinlang.org/)