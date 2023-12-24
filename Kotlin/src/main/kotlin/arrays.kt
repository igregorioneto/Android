
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

    println("Set e Map")
    var userA = mapOf(
      "country" to "BR",
        "name" to "João"
    )
    println(userA)
    var newValueUserA = "Language" to "Kotlin"
    userA += newValueUserA
    println(userA)

    val othersNames = setOf(1,2,2,3,4,4,5)
    println(othersNames)

    val arr = arrayOf(1,2,3,4,3)
    val fromArray = mutableListOf(*arr)
    println(fromArray.contains(2))
    println(2 in fromArray)
}