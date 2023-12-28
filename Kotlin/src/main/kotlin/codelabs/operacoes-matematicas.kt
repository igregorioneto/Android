package codelabs

fun main() {
    soma()
    println()
    somaValoes()
}

// Etapa 1
fun soma() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}

// Etapa 2
fun somaValoes() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    result = substract(firstNumber, secondNumber)
    anotherResult = substract(firstNumber, thirdNumber)
    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun substract(n1: Int, n2: Int): Int {
    return n1 - n2;
}