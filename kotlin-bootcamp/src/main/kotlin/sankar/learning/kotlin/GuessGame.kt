package sankar.learning.kotlin
import java.util.*

class GuessGame constructor(val tries: Int = 5, val guessRange: IntRange = 1..20) {

    var score: Int = 0

    fun start() {
        println("Guess game.. \n")
        println("Rules of the Game: This game is played against the system. The computer chooses a random number between $this.guessRange.first and $this.guessRange.last User has th guess the number." +
                "If the user guessed the correct number the user get a point." +
                "Final match score is calculated in the scale of 1 to 100\n")
        var guess: Int = 0
        var trialVal : Int = 0
        var trial : Int = 0
        val reader: Scanner = Scanner(System.`in`)
        try {
            do {
                trialVal = guessRange.random()
                ++trial
                println("Trial $trial> Guess the no between ${this.guessRange.first} and ${this.guessRange.last} :")
                //get input
                guess = reader.nextInt()
                if (validGuess(guess, trialVal)) {
                    ++score
                }
            } while (trial <= tries)
            endGame()
        } finally {
            reader.close()
        }
    }

    fun validGuess(guess: Int, actual: Int): Boolean {
        if (guess == actual) {
            println("Congrats! Tour guess $guess is correct\n")
            return true
        } else {
            println("Wrong Guess.. Actual value is $actual \n")
            return false
        }
    }

    fun endGame() {
        println("Your scored ${this.score} out of ${this.tries}")
    }
}

fun main() {
    var game: GuessGame = GuessGame()
    game.start()
}
