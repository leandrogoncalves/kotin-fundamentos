package collections.lambdas

fun main() {
    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Feijão" to 5.5,
        "Batata" to 3.8
    )

    val maxPrice = products
        .map { it.value }
        .max()
    println("Maior preço: $maxPrice")

    val minPriceProduct = products
        .minBy { it.value }
        .key
    println("Produto com menor preço: $minPriceProduct")

    val listMinorPrice = products
       .filter { it.value < 5 }
       .keys
    println("Produtos com preço menor que 5: $listMinorPrice")



}