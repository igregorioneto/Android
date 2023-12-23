
fun main() {
    println("Arrays...")

    println("Lista imutável...")
    var numeros = listOf<Int>(1,2,3,4,5);
    for (n in numeros) {
        print("$n ")
    }

    println("Lista mutável...")
    var nomes = mutableListOf<String>("João", "Ana", "Maria")
    nomes.add("Luiz")
    for ((index, nome) in nomes.withIndex()) {
        println("$index, $nome")
    }

    println("Lista com null nos elementos")
    var listOfNullables: List<Int?> = listOf(1,null,2,3,null,4)
    println("Lista com null na lista inteira...")
    var listOfNull: List<Int>? = null
}