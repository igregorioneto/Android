
fun main() {
    println("Lambdas...")

    var arr = listOf(1,2,3,4,5,6)
    arr.forEach {
        println(it > 3)
    }

    println(arr.map {
        it * 0.8
    })

    println(arr.reduce {a, b ->
        a + b
    })

    println(arr.fold(5) {a,b ->
        a + b
    })
}