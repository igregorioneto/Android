package exercicios

const val constante = 10
fun main() {
    println("Base Kotlin")
    val num1: Int = 10
    val num2: Int = 5
    println("A soma é ${num1 + num2}")
    println("A soma com constante é ${num1 + constante}")

    println("Trabalhando com Double")
    val n1 = 10.5
    val n2 = 1.5
    val resultado = "%.2f".format(n1 / n2)
    println("O resultado da divisão é $resultado")

    println("Trabalhando com Coordenadas")
    val coordenates = Pair(2,3)
    println("Coordenada x ${coordenates.first} - Coordenada y ${coordenates.second}")

    val cood = 5 to 3
    println("Coordenada x ${cood.first} - Coordenada y ${cood.second}")

    val (x, y) = cood
    println("Coordenada x $x - Coordenada y $y")

    println("Trabalhando com Multiplas linhas")
    val texto = """
        Hello World!
        Trabalhando com multiplas linhas!
    """.trimIndent()
    print(texto)
}