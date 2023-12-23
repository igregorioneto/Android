

fun main() {
    println("A soma é ${sum(2)}")
    println("Função recebendo a função soma como parâmetro: ${resultOperationFunction(::sum, 5,3)}")
    println("Função recebendo a função multiplicação como parâmetro: ${resultOperationFunction(::multi, x = 5,y = 3)}")
}

fun sum(x: Int, y: Int = 2): Int {
    return x + y
}

fun multi(x: Int, y: Int): Int {
    return x * y
}

fun resultOperationFunction(function: (Int, Int) -> Int, x: Int, y: Int): Int {
    return function(x, y)
}