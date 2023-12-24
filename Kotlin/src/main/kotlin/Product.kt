class Product(var name: String, var price: Double) {
    override fun equals(other: Any?): Boolean {
        if (this == other)
            return true

        if (other == null)
            return false

        if (javaClass != other.javaClass)
            return false

        val obj = other as Product

        if (name != obj.name)
            return false

        if (price != obj.price)
            return false

        return true
    }

    override fun toString(): String {
        return "Product is (name=$name, price=$price)"
    }
}

object Products {
    val allProducts = mutableListOf<Product>()

    fun addProduct(p: Product) {
        allProducts.add(p)
    }
}

fun main() {
    Products.addProduct(Product("Iphone", 3000.0))
    Products.addProduct(Product("Macbook", 14000.0))

    Products.allProducts.forEach {
        println(it.name)
    }
}