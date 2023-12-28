package exercicios

fun main() {
    //forever()
    println("Trabalhando com Condição")
    val countBankValue = 1900
    val phone = if (countBankValue > 1900) "iphone"
        else if (countBankValue > 1500) "samsung"
        else if (countBankValue > 1000) "motorola"
        else "outro"

    println(phone)

    println("Trabalhando com Repetição")
    var sum = 0
    while (sum < 1000) {
        println(sum)
        sum += 1
    }
    println("================================")
    sum = 0
    do {
        println(sum)
        sum += 1
    } while (sum < 1000)

    println("================================")
    val range = 0..5
    val decrease = 5 downTo 0
    val rangeUntil = 0 until 5 // irá até o valor 4
    for (x in range) {
        print(x)
    }
    range.forEach {println(it)}

    println("Pulando para uma linha de referência")
    sum = 0
    col@ for (y in 0 until 8) {
        row@ for (x in 0 until 8) {
            sum += x * y
            if (x == y)
                continue@col
        }
    }

    println("When para condição")
    val user = "Samsung"
    when (user) {
        "Samsung", "Motorola" -> println("Android")
        else -> println("iOS")
    }
}

fun forever() {
    while(true) {
        Thread.sleep(1000);
        println("oi")
    }
}