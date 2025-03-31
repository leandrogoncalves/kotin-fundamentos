package ObjectOrientation.inheritance

fun main() {
    val tree1 = Tree("Red", 10.0)
    val tree2 = tree1.clone()

    println(tree1)
    println(tree2)
    println(tree1.d())
}

interface A {
    fun a()
}

interface B : A {
    fun b()
}

interface C {
    fun c()

    fun d() {
        println("d() in C")
    }
}

interface Cloneable {
    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
): Cloneable, B, C {
    override fun clone(): Any {
        return Tree(color, height)
    }

    override fun a() {
        TODO("Not yet implemented")
    }

    override fun b() {
        TODO("Not yet implemented")
    }

    override fun c() {
        TODO("Not yet implemented")
    }

}